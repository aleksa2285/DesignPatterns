package Stores;

import PizzaTypes.Pizza;

public abstract class PizzaStore {

        public abstract void createPizza(String item);
        public void orderPizza(String type){
            createPizza(type);
        };
}
