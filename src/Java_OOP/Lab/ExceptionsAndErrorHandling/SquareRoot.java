package Java_OOP.Lab.ExceptionsAndErrorHandling;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        try {
            int num = Integer.parseInt(input);
            if (num >= 0) {
                System.out.printf("%.2f\n", Math.sqrt(num));
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException ignored) {
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");
        }


    }
}
