package Animals.Utils;

import Animals.Behaviors.Fly.FlyNoWay;
import Animals.Behaviors.Quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehvaior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am THE model duck!");
    }
}
