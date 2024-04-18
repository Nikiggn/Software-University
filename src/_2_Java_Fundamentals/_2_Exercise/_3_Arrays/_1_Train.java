package _2_Java_Fundamentals._2_Exercise._3_Arrays;

import java.util.Scanner;

public class _1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[wagons];
        int sum = 0;

        for (int i = 0; i < wagons; i++) {
            int pass = Integer.parseInt(scanner.nextLine());
            arr[i] = pass;
            sum += pass;

            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
        System.out.println(sum);
    }
}
