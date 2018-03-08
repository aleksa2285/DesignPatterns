package Animals.Tests;

import Animals.Behaviors.Fly.FlyRocketPowered;
import Animals.Utils.Duck;
import Animals.Utils.MallardDuck;
import Animals.Utils.ModelDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehvaior(new FlyRocketPowered());
        model.performFly();

    }
}
