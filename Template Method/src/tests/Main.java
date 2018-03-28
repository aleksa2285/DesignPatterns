package tests;

import templates.CaffeineBeverage;
import templates.CaffeineBeverageWithHook;
import beverages.Coffee;
import beverages.CoffeeWithHook;

public class Main {

    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        System.out.println("\n Preparing coffee");
        coffee.prepareRecipe();
        CaffeineBeverageWithHook anotherCoffee = new CoffeeWithHook();
        System.out.println("\n Preparing another coffee");
        anotherCoffee.prepareRecipe();
    }
}
