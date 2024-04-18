package _4_Java_OOP.Exercise.Polymorphism.Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carParts = scanner.nextLine().split("\\s+");
        double fuelQuantity = Double.parseDouble(carParts[1]);
        double fuelConsumption = Double.parseDouble(carParts[2]);
        Car car = new Car(fuelQuantity, fuelConsumption);

        String[] truckParts = scanner.nextLine().split("\\s+");
        double fuelQuantity1 = Double.parseDouble(truckParts[1]);
        double fuelConsumption1 = Double.parseDouble(truckParts[2]);
        Truck truck = new Truck(fuelQuantity1, fuelConsumption1);

        int commands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commands; i++) {
            String[] commandParts = scanner.nextLine().split("\\s+");

            switch (commandParts[0]) {
                case "Drive":
                    double distanceToDrive = Double.parseDouble(commandParts[2]);
                    if (commandParts[1].equals("Truck")) {
                        truck.driving(distanceToDrive);
                    } else {
                        car.driving(distanceToDrive);
                    }
                    break;

                case "Refuel":
                    double litresToRefuel = Double.parseDouble(commandParts[2]);
                    if (commandParts[1].equals("Truck")) {
                        truck.refueling(litresToRefuel);
                    } else {
                        car.refueling(litresToRefuel);
                    }
                    break;
            }

        }

        System.out.println(car);
        System.out.println(truck);

    }
}
