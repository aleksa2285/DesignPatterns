package Animals.Behaviors.Fly;

import Animals.Behaviors.BasicBehaviors.FlyBehvaior;

public class FlyNoWay implements FlyBehvaior {
    @Override
    public void fly() {
        System.out.println("I can't fly :'( ");
    }
}
