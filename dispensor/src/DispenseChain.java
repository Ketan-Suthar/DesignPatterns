public interface DispenseChain {
    void setNextDispenseChain(DispenseChain nextDispenseChain);

    void dispense(Currency currency);
}
