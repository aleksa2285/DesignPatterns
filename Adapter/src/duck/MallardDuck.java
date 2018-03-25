package duck;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quacking as a mallard duck");
    }

    @Override
    public void fly() {
        System.out.println("Flying as a mallard duck");
    }
}
