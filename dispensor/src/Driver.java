public class Driver {
    public static void main(String[] args) {
        Currency currency = new Currency(9);
        Rupee50Dispenser rupee50Dispenser = new Rupee50Dispenser();
        Rupee20Dispenser rupee20Dispenser = new Rupee20Dispenser();
        Rupee10Dispenser rupee10Dispenser = new Rupee10Dispenser();
        Rupee1Dispenser rupee1Dispenser = new Rupee1Dispenser();

        rupee50Dispenser.setNextDispenseChain(rupee20Dispenser);
        rupee20Dispenser.setNextDispenseChain(rupee10Dispenser);
        rupee10Dispenser.setNextDispenseChain(rupee1Dispenser);

        rupee50Dispenser.dispense(currency);
    }
}