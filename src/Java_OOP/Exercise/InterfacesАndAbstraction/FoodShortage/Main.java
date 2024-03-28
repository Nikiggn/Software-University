package Java_OOP.Exercise.InterfacesАndAbstraction.FoodShortage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Citizen> citizenList = new ArrayList<>();
        List<Rebel> rebelList = new ArrayList<>();

        int foodPurchased = 0;

        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);

            if (parts.length == 3) {
                String group = parts[2];
                Rebel rebel = new Rebel(name, age, group);
                rebelList.add(rebel);
            } else {
                String id = parts[2];
                String birthDate = parts[3];

                Citizen citizen = new Citizen(name, age, id, birthDate);
                citizenList.add(citizen);
            }
        }

        String command = scanner.nextLine();

        while (!"End".equals(command)) {
            for (Citizen citizen : citizenList) {
                if (citizen.getName().equals(command)) {
                    foodPurchased += 10;
                }
            }

            for (Rebel rebel : rebelList) {
                if (rebel.getName().equals(command)) {
                    foodPurchased += 5;
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(foodPurchased);
    }
}
