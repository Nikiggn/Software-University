package _4_Java_OOP.Exercise.Inheritance.Vehicle;

public class Vehicle {
    private final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;


    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
    public double getFuelConsumption() {
        return fuelConsumption;
    }
    public void drive(double kilometers){
        double consumedFuel = kilometers * this.getFuelConsumption();
        if (consumedFuel <= this.getFuel()) {
            double leftFuel = this.fuel - consumedFuel;
            this.setFuel(leftFuel);
        }
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
