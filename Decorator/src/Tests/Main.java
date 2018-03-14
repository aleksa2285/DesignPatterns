package Tests;

import Beverages.*;
import Condiments.Milk;
import Condiments.Mocha;
import Condiments.Soy;
import Condiments.Whip;

public class Main {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        System.out.println("------------------------------------");

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Milk(beverage2);
        beverage2 = new Milk(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        System.out.println("------------------------------------");

        Beverage beverage3  = new Decaf();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Milk(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

        System.out.println("------------------------------------");

        Beverage beverage4 = new HouseBlend();
        beverage4 = new Mocha(beverage4);
        beverage4 = new Whip(beverage4);
        System.out.println(beverage4.getDescription() + " $" + beverage4.cost());

        System.out.println("------------------------------------");

        Beverage beverage5 = new Decaf();
        beverage5 = new Whip(new Mocha(new Milk(beverage5)));
        System.out.println(beverage5.getDescription() + " $" + beverage5.cost());

    }
}
