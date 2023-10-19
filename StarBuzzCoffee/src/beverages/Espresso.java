package beverages;

import Condiments.CondimentDecorator;

public class Espresso extends IBeverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
