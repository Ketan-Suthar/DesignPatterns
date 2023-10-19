import Condiments.Mocha;
import Condiments.Whip;
import beverages.HouseBlend;
import beverages.IBeverage;

public class Driver {
    public static void main(String[] args) {
        IBeverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
