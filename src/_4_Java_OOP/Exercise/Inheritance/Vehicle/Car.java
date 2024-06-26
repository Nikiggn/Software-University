package _4_Java_OOP.Exercise.Inheritance.Vehicle;

public class Car extends Vehicle{
    private final static double DEFAULT_FUEL_CONSUMPTION = 3;

    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
