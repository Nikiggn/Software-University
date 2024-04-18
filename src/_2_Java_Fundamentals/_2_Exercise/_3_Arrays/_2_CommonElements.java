package _2_Java_Fundamentals._2_Exercise._3_Arrays;

import java.util.Scanner;

public class _2_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        String[] arr1 = first.split(" ");
        String[] arr2 = second.split(" ");

        for (String elem2 : arr2) {
            for (String el1 : arr1) {
                if (elem2.equals(el1)) {
                    System.out.print(elem2 + " ");
                }
            }
        }
    }
}
