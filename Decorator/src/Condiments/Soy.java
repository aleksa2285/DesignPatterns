package Condiments;

import Beverages.BaseBeverage;

public class Soy extends CondimentDecorator {
    BaseBeverage beverage;

    public Soy(BaseBeverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
