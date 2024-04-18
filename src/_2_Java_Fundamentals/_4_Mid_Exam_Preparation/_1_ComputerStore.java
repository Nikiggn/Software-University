package _20_MidExamPreparation;

import java.util.Scanner;

public class _1_ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        String command = "";

        while (true) {
            command = scanner.nextLine();

             if (command.equals("special") || command.equals("regular")) {
                break;
            }

            double num = Double.parseDouble(command);
            sum += num;

            if (num < 0) {
                System.out.println("Invalid price!");
                sum -= num;
            }
        }

        double taxes = sum * 0.2;
        double totalPRICE = sum + taxes;

        if (command.equals("special")) {
            totalPRICE = totalPRICE * 0.9;
        }

        if (totalPRICE > 0) {
            System.out.println("Congratulations you've just bought a new computer!");
        } else {
            System.out.println("Invalid order!");
            return;
        }

        System.out.printf("Price without taxes: %.2f$%n", sum);
        System.out.printf("Taxes: %.2f$%n", taxes);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$", totalPRICE);
    }
}
