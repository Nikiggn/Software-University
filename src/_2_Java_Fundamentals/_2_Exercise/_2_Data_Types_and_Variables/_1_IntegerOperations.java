package _2_Java_Fundamentals._2_Exercise._2_Data_Types_and_Variables;

import java.util.Scanner;

public class _1_IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        int sum = ((a + b) / c) * d;

        System.out.println(sum);
    }
}
