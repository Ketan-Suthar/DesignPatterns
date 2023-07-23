public class Rupee1Dispenser implements DispenseChain {
    private DispenseChain nextDispenser;
    private static final int AMOUNT = 1;

    @Override
    public void setNextDispenseChain(final DispenseChain nextDispenseChain) {
        this.nextDispenser = nextDispenseChain;
    }

    @Override
    public void dispense(final Currency currency) {
        if(currency.getAmount() >= AMOUNT) {
            final var rs50notes = currency.getAmount() / AMOUNT;
            System.out.println("Dispensing " + rs50notes + " " + AMOUNT + " rupee notes");
        }else{
            if(nextDispenser != null) {
                nextDispenser.dispense(currency);
            }
        }
    }
}
