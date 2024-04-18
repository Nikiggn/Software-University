package _2_Java_Fundamentals._2_Exercise._1_Basic;

import java.util.Scanner;

public class _9_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double total  = 0;

        for (int i = 1; i <= orders ; i++) {
            double priceCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulCount = Integer.parseInt(scanner.nextLine());

            double sum = ((days * capsulCount) * priceCapsule);
            System.out.printf("The price for the coffee is: $%.2f%n", sum);

            total += sum;

        }
        System.out.printf("Total: $%.2f",total);
    }
}
