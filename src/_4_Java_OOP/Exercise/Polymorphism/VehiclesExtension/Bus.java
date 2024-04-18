package _4_Java_OOP.Exercise.Polymorphism.VehiclesExtension;

public class Bus extends VehicleImpl {

    protected Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void driving(double distanceToDrive) {
        super.driving(distanceToDrive);
    }

    @Override
    public void refueling(double fuel, double tankCapacity)  {
        super.refueling(fuel,tankCapacity);
    }

    public void withPeople(){
        super.setFuelConsumption(super.getFuelConsumption() + 1.4);
    }
}
