package PizzaTypes;
import Ingredients.Types.Cheese.Cheese;
import Ingredients.Types.Clams.Clams;
import Ingredients.Types.Dough.Dough;
import Ingredients.Types.Pepperoni.Pepperoni;
import Ingredients.Types.Sauce.Sauce;
import Ingredients.Types.Veggies.Veggies;

import java.util.Arrays;

public abstract class Pizza {

    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies[] veggies;
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clam;

    public Pizza() {}
    abstract void prepare();
    void bake(){
        System.out.println("Bake for 25 minutes at 350 degrees");
    };
    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    };
    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    };
    void aloha(){
        System.out.println(this.getClass());
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){this.name = name;}
    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clam=" + clam +
                '}';
    }
}
