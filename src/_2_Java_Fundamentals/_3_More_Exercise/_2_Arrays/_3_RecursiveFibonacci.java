package _2_Java_Fundamentals._3_More_Exercise._2_Arrays;

import java.util.Scanner;

public class _3_RecursiveFibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= size; i++) {
            trieangle(i);
        }


        for (int i = size - 1; i >= 1; i--) {
            trieangle(i);
        }


    }

    public static void trieangle(int elem) {
        for (int i = 1; i <= elem; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();

    }
}
