public class Driver {
    public static void main(String[] args) {
        HouseTemplate houseTemplate = new WoodenHouse();
        houseTemplate.buildHouse();

        System.out.println("\n\n");

        houseTemplate = new GlassHouse();
        houseTemplate.buildHouse();
    }
}