package _4_Java_OOP.Exercise.Polymorphism.Vehicles;

public class Truck extends VehicleImpl {
    protected Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 1.6);
     }

    @Override
    public void driving(double distanceToDrive) {
        super.driving(distanceToDrive);
    }

    @Override
    public void refueling(double fuel) {
        super.refueling(fuel * 0.95);
    }

}
