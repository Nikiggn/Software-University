package Java_OOP.Exercise.Polymorphism.Vehicles;

import java.text.DecimalFormat;

public abstract class VehicleImpl implements Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;

    protected VehicleImpl(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void driving(double distanceToDrive) {
        double needed = this.fuelConsumption * distanceToDrive;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");

        if (this.fuelQuantity >= needed) {
            this.fuelQuantity -= needed;
            System.out.printf("%s travelled %s km\n"
                    , this.getClass().getSimpleName()
                    , decimalFormat.format(distanceToDrive));
        } else {
            System.out.printf("%s needs refueling\n", this.getClass().getSimpleName());
        }

    }

    public void refueling(double fuel) {
        this.fuelQuantity += fuel;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.getFuelQuantity());
    }
}
