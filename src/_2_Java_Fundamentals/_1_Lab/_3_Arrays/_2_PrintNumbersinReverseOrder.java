package _2_Java_Fundamentals._1_Lab._3_Arrays;

import java.util.Scanner;

public class _2_PrintNumbersinReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[n];

        for (int i = 0; i <n ; i++) {
            int number  = Integer.parseInt(scanner.nextLine());
            numbers[i] = number;
        }

        for (int i = numbers.length - 1; i >= 0  ; i--) {
            System.out.println(numbers[i] + " ");
        }
        System.out.println();
    }
}
