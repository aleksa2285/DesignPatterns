package Animals.Utils;

import Animals.Behaviors.BasicBehaviors.FlyBehvaior;
import Animals.Behaviors.BasicBehaviors.QuackBehavior;

public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehvaior flyBehvaior;

    public Duck() {
    }
    public void performQuack(){
        quackBehavior.quack();
    };
    public void performFly(){
        flyBehvaior.fly();
    };
    public void setFlyBehvaior(FlyBehvaior flyBehavior){
        this.flyBehvaior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    public void swim(){
        System.out.println("All ducks float, even decoy ones!");
    };
    public abstract void display();
}
