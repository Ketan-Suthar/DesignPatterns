package com;

public class Client
{
    public static void main(String[] args)
    {
        Director director = new Director();

        BuilderInterface carBuilder = new Car();
        BuilderInterface motorCycleBuilder = new MotorCycle();

        director.construct(carBuilder);

        Product p1 = carBuilder.getVehicle();
        p1.show();

        director.construct(motorCycleBuilder);
        Product p2 = motorCycleBuilder.getVehicle();
        p2.show();
    }
}
