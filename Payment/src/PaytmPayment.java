public class PaytmPayment implements PaymentStrategy {
    @Override
    public void pay(final int amount) {
        System.out.println("paying " + amount + " using Paytm");
    }
}
