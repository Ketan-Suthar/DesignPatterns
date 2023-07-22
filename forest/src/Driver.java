public class Driver {
    public static void main(String[] args) {
        final var forest = new Forest();
        forest.plantTree("tulsi", "green", 1, 1);
        forest.plantTree("tulsi", "red", 1, 2);
        forest.plantTree("tulsi", "green", 2, 1);
        forest.plantTree("tulsi", "red", 2, 2);
        forest.plantTree("oak", "green", 3, 1);
        forest.plantTree("oak", "green", 3, 2);
        forest.plantTree("oak", "green", 4, 1);
        forest.plantTree("oak", "green", 4, 2);

        forest.draw();
    }
}
