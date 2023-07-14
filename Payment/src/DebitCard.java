public class DebitCard implements PaymentStrategy {
    @Override
    public void pay(final int amount) {
        System.out.println("paying " + amount + " using DebitCard");
    }
}
