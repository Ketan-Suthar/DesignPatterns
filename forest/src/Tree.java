public class Tree {
    private final int x;
    private final int y;
    private final TreeType type;

    public Tree(final int x, final int y, final TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() {
        System.out.println("Drawing tree: " + type + " at (" + x + ',' + y + ')');
    }
}
