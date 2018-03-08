package Animals.Behaviors.Quack;

import Animals.Behaviors.BasicBehaviors.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack, quack!");
    }
}
