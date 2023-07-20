public class Bike extends Vehicle {
    public Bike(final Workshop workshop1, final Workshop workshop2){
        super(workshop1, workshop2);
    }

    public void manufacture() {
        System.out.println("\nmanufacturing bike");
        workshop1.doWork();
        workshop2.doWork();
        System.out.println("manufactured bike completely\n");
    }
}
