package _3_Java_Advance._3_ExamPreperation._3_OOP.automotiveRepairShop;

import java.util.ArrayList;
import java.util.List;

public class RepairShop {

    private int capacity;
    private List<Vehicle> vehicles;


    public RepairShop(int capacity) {
        this.capacity = capacity;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        if (this.vehicles.size() < capacity) {
            this.vehicles.add(vehicle);
        }
    }

    public boolean removeVehicle(String vin) {
        for (Vehicle vehicle : this.vehicles) {
            if (vehicle.getVIN().equals(vin)) {
                return this.vehicles.remove(vehicle);
            }
        }
        return false;
    }

    public int getCount() {
        return this.vehicles.size();
    }

    public Vehicle getLowestMileage() {
        Vehicle lowestMileage = null;
        for (Vehicle vehicle : this.vehicles) {
            if (lowestMileage == null) {
                lowestMileage = vehicle;
            }
            if (vehicle.getMileage() < lowestMileage.getMileage()) {
                lowestMileage = vehicle;
            }
        }
        return lowestMileage;
    }

    public String report() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vehicles in the preparatory:\n");
        for (Vehicle vehicle : this.vehicles) {
            stringBuilder.append(vehicle.toString()).append("\n");
        }
        return stringBuilder.toString();
    }


}
