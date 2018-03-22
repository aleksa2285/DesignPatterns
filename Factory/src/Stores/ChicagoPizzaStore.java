package Stores;

import AbstractFactory.PizzaIngredientFactory;
import ConcreteFactories.ChicagoIngredientFactory;
import PizzaTypes.CheesePizza;
import PizzaTypes.ClamPizza;
import PizzaTypes.Pizza;
import PizzaTypes.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public void createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();

        if (item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }
        else if(item.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }
        else if(item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        else if (item.equals("pepperoni")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        System.out.println(pizza);
    }
//    @Override
//    void orderPizza(String type) {
//        createPizza(type);
//    }
}
