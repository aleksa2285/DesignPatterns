package tests;

import adapters.TurkeyAdapter;
import duck.Duck;
import duck.MallardDuck;
import turkeys.WildTurkey;

public class Main {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter( turkey );

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says...");
        duck.quack();
        duck.fly();

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

    }
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
