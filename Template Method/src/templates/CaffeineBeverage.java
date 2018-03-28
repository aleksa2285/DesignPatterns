package templates;

public abstract class CaffeineBeverage {

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    };
    public void boilWater(){
        System.out.println("Boiling that water");
    }
    public abstract void brew();
    public void pourInCup(){
        System.out.println("Pouring into cup");
    };
    public abstract void addCondiments();

}
