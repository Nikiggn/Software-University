package _4_Java_OOP.Exercise.Polymorphism.VehiclesExtension;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInput = scanner.nextLine().split(" ");
        Car car = new Car(Double.parseDouble(carInput[1])
                , Double.parseDouble(carInput[2])
                , Double.parseDouble(carInput[3]));

        String[] truckInput = scanner.nextLine().split(" ");
        Truck truck = new Truck(Double.parseDouble(truckInput[1])
                , Double.parseDouble(truckInput[2])
                , Double.parseDouble(truckInput[3]));

        String[] busInput = scanner.nextLine().split(" ");
        Bus bus = new Bus(Double.parseDouble(busInput[1])
                , Double.parseDouble(busInput[2])
                , Double.parseDouble(busInput[3]));

        int commands = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < commands; i++) {
            String[] parts = scanner.nextLine().split(" ");

            switch (parts[0]){
                case "Drive":
                    double distance = Double.parseDouble(parts[2]);
                    switch (parts[1]){
                        case "Car":
                            car.driving(distance);
                            break;
                        case "Truck":
                            truck.driving(distance);
                            break;
                        case "Bus":
                            bus.withPeople();
                            bus.driving(distance);
                            break;
                    }
                    break;
                case "DriveEmpty":
                    double distance1 = Double.parseDouble(parts[2]);
                    bus.driving(distance1);
                    break;
                case "Refuel":
                    double litres = Double.parseDouble(parts[2]);
                    switch (parts[1]){
                        case "Car":
                            car.refueling(litres, Double.parseDouble(carInput[3]));
                            break;
                        case "Truck":
                            truck.refueling(litres, Double.parseDouble(truckInput[3]));
                            break;
                        case "Bus":
                            bus.refueling(litres, Double.parseDouble(busInput[3]));
                            break;
                    }
                    break;
            }
        }

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }
}
