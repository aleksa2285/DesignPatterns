package tests;

public class ChocolateBoiler {

    private volatile static ChocolateBoiler uniqueInstance;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }
    public static synchronized ChocolateBoiler getInstance(){
        if (uniqueInstance == null){
            synchronized (ChocolateBoiler.class){
                if (uniqueInstance == null) uniqueInstance = new ChocolateBoiler();
            }
        }
        return uniqueInstance;
    }
    public void fill(){
        if (isEmpty()){
            empty = false;
            boiled = false;
            //fill the boiler with a milk/chocolate mixture! :)
        }
    }
    public void drain(){
        if (!isEmpty() && isBoiled()) empty = true;
    }
    public void boil(){
        if (!isEmpty() && !isBoiled()){
            //bring the contents to a boil
            boiled = true;
        }
    }
    public boolean isEmpty(){
        return this.empty;
    }
    public boolean isBoiled(){
        return this.boiled;
    }
}
