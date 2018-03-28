package templates;

public abstract class CaffeineBeverageWithHook {

    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }
    }
    public abstract void brew();
    public abstract void addCondiments();
    void boilWater(){
        System.out.println("Boiling that water");
    }
    void pourInCup(){
        System.out.println("Pouring into the cup");
    }
    boolean customerWantsCondiments(){
        return true;
    }

}
