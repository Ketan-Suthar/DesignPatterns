public class Car extends Vehicle {
    public Car(final Workshop workshop1, final Workshop workshop2){
        super(workshop1, workshop2);
    }

    public void manufacture() {
        System.out.println("\nmanufacturing car");
        workshop1.doWork();
        workshop2.doWork();
        System.out.println("manufactured car completely\n");
    }
}
