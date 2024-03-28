package Java_OOP.Exercise.Polymorphism.Vehicles;

public class Car extends VehicleImpl {

    protected Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 0.9);
    }

    @Override
    public void driving(double distanceToDrive) {
        super.driving(distanceToDrive);
    }


    @Override
    public void refueling(double fuel)  {
        this.setFuelQuantity(this.getFuelQuantity() + fuel);
    }

}
