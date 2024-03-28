package Java_OOP.Exercise.Inheritance.Vehicle;

public class SportCar extends Car{
    private final static double DEFAULT_FUEL_CONSUMPTION = 10;

    public SportCar(double fuel, int horsePower) {

        super(fuel, horsePower); //1
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION); //1

        //2 super(fuel, horsePower,DEFAULT_FUEL_CONSUMPTION);
    }
}
