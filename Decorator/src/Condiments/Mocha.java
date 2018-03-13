package Condiments;

import Beverages.BaseBeverage;

public class Mocha extends CondimentDecorator {
    BaseBeverage beverage;

    public Mocha(BaseBeverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
