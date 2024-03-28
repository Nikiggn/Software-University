package Java_OOP.Exercise.Polymorphism.VehiclesExtension;


import java.text.DecimalFormat;

public  class VehicleImpl implements Vehicle {

    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    protected VehicleImpl(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
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
            System.out.printf("%s needs refueling\n",
                    this.getClass().getSimpleName());
        }

    }

    public void refueling(double fuel, double tankCapacity) {
        if (fuel <= 0) {
            System.out.println("Fuel must be a positive number");
        } else {
            if (this.fuelQuantity + fuel <= tankCapacity) {
                this.fuelQuantity += fuel;
            } else {
                System.out.println("Cannot fit fuel in tank");
            }
        }

    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.getFuelQuantity());
    }

    public double getTankCapacity() {
        return tankCapacity;
    }
}
