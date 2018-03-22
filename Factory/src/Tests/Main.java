package Tests;

import PizzaTypes.Pizza;
import Stores.ChicagoPizzaStore;
import Stores.NYPizzaStore;
import Stores.PizzaStore;

public class Main {

    public static void main(String[] args) {
        Pizza pizza;
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        nyPizzaStore.orderPizza("pepperoni");
        chicagoPizzaStore.orderPizza("cheese");

    }
}
