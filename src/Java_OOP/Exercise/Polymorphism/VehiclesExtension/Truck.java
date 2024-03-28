package Java_OOP.Exercise.Polymorphism.VehiclesExtension;


public class Truck extends VehicleImpl {


    protected Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 1.6, tankCapacity);
    }

    @Override
    public void driving(double distanceToDrive) {
        super.driving(distanceToDrive);
    }

    @Override
    public void refueling(double fuel, double tankCapacity) {
        super.refueling(fuel * 0.95, tankCapacity);
    }



}
