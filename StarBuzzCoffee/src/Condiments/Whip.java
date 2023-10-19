package Condiments;

import beverages.IBeverage;

public class Whip extends CondimentDecorator {
    IBeverage beverage;

    public Whip(final IBeverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
