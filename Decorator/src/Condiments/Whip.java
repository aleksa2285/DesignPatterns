package Condiments;

import Beverages.BaseBeverage;

public class Whip extends CondimentDecorator {

    BaseBeverage beverage;

    public Whip(BaseBeverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
    @Override
    public String getDescription() {
        return beverage.description + ", Whip";
    }
}
