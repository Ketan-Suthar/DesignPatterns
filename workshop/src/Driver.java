public class Driver {
    public static void main(String[] args) {
        Workshop produceWorkshop = new Produce();
        Workshop assembleWorkshop = new Assemble();

        Vehicle vehicle1 = new Car(produceWorkshop, assembleWorkshop);
        vehicle1.manufacture();

        Vehicle vehicle2 = new Bike(produceWorkshop, assembleWorkshop);
        vehicle2.manufacture();
    }
}
