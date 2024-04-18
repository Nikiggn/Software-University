package _2_Java_Fundamentals._2_Exercise._3_Arrays;

import java.util.Scanner;

public class _3_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int[] arr1  = new int[n];
        int[] arr2 = new int[n];

        for (int i = 1; i <= n ; i++) {
            String number = scanner.nextLine();
            String[] numbers = number.split(" ");
            int number1 = Integer.parseInt(numbers[0]);
            int number2 = Integer.parseInt(numbers[1]);

            if (i % 2 != 0){
                arr1[i - 1] = number1;
                arr2[i - 1] = number2;
            }else {
                arr1[i - 1] = number2;
                arr2[i - 1] = number1;
            }
        }

        for (int el1 : arr1) {
            System.out.print(el1 + " ");
        }

        System.out.println();
        for (int el2 : arr2) {
            System.out.print(el2 + " ");
        }
    }
}
