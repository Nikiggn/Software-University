package _4_Java_OOP.Exercise.Polymorphism.VehiclesExtension;


public class Car extends VehicleImpl {


    protected Car(double fuelQuantity, double fuelConsumption,double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 0.9, tankCapacity);
    }

    @Override
    public void driving(double distanceToDrive) {
        super.driving(distanceToDrive);
    }

    @Override
    public void refueling(double fuel, double tankCapacity)  {
        super.refueling(fuel,tankCapacity);
    }

}
