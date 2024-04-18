package _2_Java_Fundamentals._3_More_Exercise._4_Data_Types_and_Variables;

import java.util.Scanner;

public class n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= lines; i++) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            double num1 = Math.abs(Double.parseDouble(parts[0]));
            double num2 = Math.abs(Double.parseDouble(parts[1]));

            int sum1 = 0;
            int sum2 = 0;

            while (num1 > 0) {
                sum1 += (int) (num1 % 10);
                num1 = num1 / 10;
            }

            while (num2 > 0) {
                sum2 += (int) (num2 % 10);
                num2 = num2 / 10;
            }

            if (sum1 >= sum2) {
                System.out.println(sum1);
            } else {
                System.out.println(sum2);
            }

        }
    }
}
