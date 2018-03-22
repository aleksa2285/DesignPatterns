package ConcreteFactories;

import AbstractFactory.PizzaIngredientFactory;
import Ingredients.Types.Cheese.Cheese;
import Ingredients.Types.Cheese.Mozzarela;
import Ingredients.Types.Clams.Clams;
import Ingredients.Types.Clams.FrozenClam;
import Ingredients.Types.Dough.Dough;
import Ingredients.Types.Dough.ThickCrustDough;
import Ingredients.Types.Pepperoni.Pepperoni;
import Ingredients.Types.Pepperoni.SlicedPepperoni;
import Ingredients.Types.Sauce.PlumTomatoSauce;
import Ingredients.Types.Sauce.Sauce;
import Ingredients.Types.Veggies.BlackOlives;
import Ingredients.Types.Veggies.EggPlant;
import Ingredients.Types.Veggies.Spinach;
import Ingredients.Types.Veggies.Veggies;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }
    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
    @Override
    public Cheese createCheese() {
        return new Mozzarela();
    }
    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new EggPlant(), new Spinach(), new BlackOlives()};
    }
    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
    @Override
    public Clams createClam() {
        return new FrozenClam();
    }
}
