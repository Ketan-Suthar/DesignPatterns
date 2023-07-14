public class Driver {
    public static void main(String[] args) {
        Item item1 = new Item("shoes", 100);
        Item item2 = new Item("mobile", 10000);

        Cart cart = new Cart();
        cart.addItems(item1);
        cart.addItems(item2);

        System.out.println("total: " + cart.total());
        cart.buy(new PaytmPayment());
        cart.buy(new DebitCard());
    }
}
