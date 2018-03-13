package Beverages;

public abstract class BaseBeverage {

    public String description = "Unknown beverage";
    public abstract double cost();
    public String getDescription() {
        return description;
    }
}
