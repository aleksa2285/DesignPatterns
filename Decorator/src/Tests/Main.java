package Tests;

import Beverages.*;
import Condiments.Milk;
import Condiments.Mocha;
import Condiments.Soy;

public class Main {

    public static void main(String[] args) {

        BaseBeverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        System.out.println("------------------------------------");

        BaseBeverage beverage2 = new DarkRoast();
        beverage2 = new Milk(beverage2);
        beverage2 = new Milk(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        System.out.println("------------------------------------");

        BaseBeverage beverage3  = new Decaf();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Milk(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
