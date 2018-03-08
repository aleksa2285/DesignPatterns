package Animals.Behaviors.Quack;

import Animals.Behaviors.BasicBehaviors.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Sound of silence");
    }
}
