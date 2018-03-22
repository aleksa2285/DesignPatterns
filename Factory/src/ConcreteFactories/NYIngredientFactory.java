package ConcreteFactories;

import AbstractFactory.PizzaIngredientFactory;
import Ingredients.Types.Cheese.Cheese;
import Ingredients.Types.Cheese.ReggianoCheese;
import Ingredients.Types.Clams.Clams;
import Ingredients.Types.Clams.FreshClams;
import Ingredients.Types.Dough.Dough;
import Ingredients.Types.Dough.ThinCrustDough;
import Ingredients.Types.Pepperoni.Pepperoni;
import Ingredients.Types.Pepperoni.SlicedPepperoni;
import Ingredients.Types.Sauce.MarinaraSauce;
import Ingredients.Types.Sauce.Sauce;
import Ingredients.Types.Veggies.EggPlant;
import Ingredients.Types.Veggies.Garlic;
import Ingredients.Types.Veggies.Onion;
import Ingredients.Types.Veggies.Veggies;

public class NYIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }
    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new EggPlant()};
    }
    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
