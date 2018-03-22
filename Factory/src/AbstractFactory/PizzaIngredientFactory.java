package AbstractFactory;

import Ingredients.Types.Cheese.Cheese;
import Ingredients.Types.Clams.Clams;
import Ingredients.Types.Dough.Dough;
import Ingredients.Types.Pepperoni.Pepperoni;
import Ingredients.Types.Sauce.Sauce;
import Ingredients.Types.Veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
