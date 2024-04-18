package _20_MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _3_Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inventory = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());


        while (true) {
            String command = scanner.nextLine();
            if (command.equals("Craft!")) {
                break;
            }

            String[] commandParts = command.split(" - ");
            String firstCommand = commandParts[0];
            String firstItem = commandParts[1];

            switch (firstCommand) {
                case "Collect":
                    if (!inventory.contains(firstItem)) {
                        inventory.add(firstItem);
                    }
                    break;
                case "Drop":
                    if (inventory.contains(firstItem)) {
                        inventory.remove(firstItem);
                    }
                    break;

                case "Combine Items":
                    String[] third = commandParts[1].split(":");
                    String oldItem = third[0];
                    String newItem = third[1];

                    if (inventory.contains(oldItem)){

                        int index = inventory.indexOf(oldItem);
                        inventory.add(index+1, newItem);
                    }
                    break;

                case "Renew":
                    if (inventory.contains(firstItem)) {
                        inventory.remove(firstItem);
                        inventory.add(firstItem);
                    }
                    break;
            }
        }
        System.out.println(String.join(", ", inventory));
    }
}
