package _2_Java_Fundamentals._1_Lab._3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _6_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();
        int[] arr2 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();

        int sum = 0;

        for (int i = 0; i < arr1.length ; i++) {
            if (arr1[i] != arr2[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }

            if (arr1[i] == arr2[i]){
                sum += arr1[i];
            }
        }
        System.out.printf("Arrays are identical. Sum: %d",sum);
    }
}
