public class Rupee50Dispenser implements DispenseChain {
    private DispenseChain nextDispenser;
    private static final int AMOUNT = 50;

    @Override
    public void setNextDispenseChain(final DispenseChain nextDispenseChain) {
        this.nextDispenser = nextDispenseChain;
    }

    @Override
    public void dispense(final Currency currency) {
        if(currency.getAmount() >= AMOUNT) {
            final var rs50notes = currency.getAmount() / AMOUNT;
            final var remainingAmount = currency.getAmount() % AMOUNT;
            System.out.println("Dispensing " + rs50notes + " " + AMOUNT + " rupee notes");
            if(remainingAmount > 0){
                nextDispenser.dispense(new Currency(remainingAmount));
            }
        }else{
            if(nextDispenser != null) {
                nextDispenser.dispense(currency);
            }
        }
    }
}
