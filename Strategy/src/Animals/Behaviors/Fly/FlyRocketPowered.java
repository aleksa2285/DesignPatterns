package Animals.Behaviors.Fly;

import Animals.Behaviors.BasicBehaviors.FlyBehvaior;

public class FlyRocketPowered implements FlyBehvaior {
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket! :) ");
    }
}
