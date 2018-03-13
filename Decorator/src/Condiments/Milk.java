package Condiments;

import Beverages.BaseBeverage;

public class Milk extends CondimentDecorator {
    private BaseBeverage beverage;

    public Milk(BaseBeverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
    @Override
    public double cost() {
        return  .10 + beverage.cost();
    }
}
