package _2_Java_Fundamentals._1_Lab._3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _5_EvenandOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        int[] arr = Arrays
                .stream(numbers)
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < numbers.length ; i++) {
            if (arr[i] % 2 == 0){
                sumEven += arr[i];
            }else {
                sumOdd += arr[i];
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}
