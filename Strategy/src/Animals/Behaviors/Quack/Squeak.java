package Animals.Behaviors.Quack;

import Animals.Behaviors.BasicBehaviors.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeeeeeak");
    }
}
