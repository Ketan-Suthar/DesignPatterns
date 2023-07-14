import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cart {
    private List<Item> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItems(final Item item) {
        items.add(item);
    }

    public void removeItems(final Item item) {
        items.remove(item);
    }

    public int total() {
        return items.stream().mapToInt(Item::getPrice).sum();
    }

    public void buy(final PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(total());
    }
}
