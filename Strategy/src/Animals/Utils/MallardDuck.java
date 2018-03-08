package Animals.Utils;

import Animals.Behaviors.Fly.FlyWithWings;
import Animals.Behaviors.Quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehvaior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("Looks like I'm real Mallard duck");
    }
}
