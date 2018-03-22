package Stores;

import AbstractFactory.PizzaIngredientFactory;
import ConcreteFactories.NYIngredientFactory;
import PizzaTypes.CheesePizza;
import PizzaTypes.ClamPizza;
import PizzaTypes.Pizza;
import PizzaTypes.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public void createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYIngredientFactory();

        if (item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        if (item.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }
        if (item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        if (item.equals("pepperoni")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        System.out.println(pizza);
    }
//
//    @Override
//    void orderPizza(String type) {
//        createPizza(type);
//    }
}
