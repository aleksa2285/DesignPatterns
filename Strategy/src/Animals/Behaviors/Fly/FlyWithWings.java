package Animals.Behaviors.Fly;

import Animals.Behaviors.BasicBehaviors.FlyBehvaior;

public class FlyWithWings implements FlyBehvaior{
    @Override
    public void fly() {
        System.out.println("I'm flying! ");
    }
}
