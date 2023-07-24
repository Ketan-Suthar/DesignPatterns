import java.util.ArrayList;
import java.util.List;

public class Container extends Component {
    private final List<Component> children;

    public Container() {
        children = new ArrayList<>();
    }

    public void add(final Component child) {
        children.add(child);
        child.container = this;
    }
}
