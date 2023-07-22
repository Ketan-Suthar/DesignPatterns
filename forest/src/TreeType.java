public class TreeType {
    private final String name;
    private final String color;

    public TreeType(final String name, final String color) {
        System.out.println("\nCreating new tree type");
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "TreeType{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
