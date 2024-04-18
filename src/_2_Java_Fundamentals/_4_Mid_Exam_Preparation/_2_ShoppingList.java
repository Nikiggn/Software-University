package _20_MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> productsList = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());


        while (true) {
            String command = scanner.nextLine();
            if (command.equals("Go Shopping!")) {
                break;
            }

            String[] commandParts = command.split(" ");

            String newCommand = commandParts[0];
            String newItem = commandParts[1];


            switch (newCommand) {
                case "Urgent":
                    if (!productsList.contains(newItem)) {
                        productsList.add(0, newItem);
                    }
                    break;

                case "Unnecessary":
                    if (productsList.contains(newItem)) {
                        productsList.remove(newItem);
                    }
                    break;

                case "Correct":
                    String third = commandParts[2];
                    if (productsList.contains(newItem)) {
                        int index = productsList.indexOf(newItem);
                        productsList.remove(newItem);
                        productsList.add(index, third);

                    }
                    break;

                case "Rearrange":
                    if (productsList.contains(newItem)) {
                        productsList.remove(newItem);
                        productsList.add(newItem);
                    }
                    break;

            }

        }
        System.out.println(String.join(", ", productsList));
    }
}
