package context;

import proxy.GumballMachineRemote;
import states.*;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private String location;
    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(String location, int numberOfGumballs) throws RemoteException {
        this.location = location;
        this.count = numberOfGumballs;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        if (count>0){
            this.state = noQuarterState;
        }
    }
    public void insertQuarter(){
        state.insertQuarter();
    }
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
    public void setState(State state){
        this.state = state;
    }
    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if (count!=0) count--;
    }
    public void refill(int numberOfBalls){
        this.count = numberOfBalls;
        this.setState(noQuarterState);
    }
    public State getSoldOutState() {
        return soldOutState;
    }
    public State getNoQuarterState() {
        return noQuarterState;
    }
    public State getHasQuarterState() {
        return hasQuarterState;
    }
    public State getSoldState() {
        return soldState;
    }
    public State getWinnerState() {
        return winnerState;
    }
    public State getState() {
        return state;
    }
    public int getCount() {
        return count;
    }
    public String getLocation() {
        return location;
    }
    @Override
    public String toString() {
        return "GumballMachine{" +
                "winnerState=" + winnerState +
                ", state=" + state +
                ", count=" + count +
                '}';
    }
}