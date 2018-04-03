package states;

import context.GumballMachine;

public class WinnerState implements State{

    transient private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You've already insterted the quarter!");
    }
    @Override
    public void ejectQuarter() {
        System.out.println("Impossible to eject quarter, after you've turned the Crank");
    }
    @Override
    public void turnCrank() {
        System.out.println("You already turned the crank");
    }
    @Override
    public void dispense() {
        System.out.println("You're a winner! You get two gumballs for your quarter!");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
        else{
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }
            else{
                System.out.println("Ooops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
