import java.util.ArrayList;
import java.util.List;

public class Forest {
    private final List<Tree> trees;

    public Forest() {
        trees = new ArrayList<>();
    }

    public void plantTree(final String name, final String color, final int x, final int y) {
        final var type = TreeFactory.getTreeType(name, color);
        final var tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void draw() {
        System.out.println("\nDrawing forest");
        for(final var tree: trees) {
            tree.draw();
        }
    }
}
