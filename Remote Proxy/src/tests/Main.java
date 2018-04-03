package tests;

import context.GumballMachine;
import context.GumballMonitor;

public class Main {

    public static void main(String[] args) {

        try{
            GumballMachine gumballMachine = new GumballMachine("Belgrade city center", 5);

            System.out.println(gumballMachine);

            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();

            System.out.println(gumballMachine);

            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();

            System.out.println(gumballMachine);
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            System.out.println(gumballMachine);
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();

            GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
            gumballMonitor.report();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
