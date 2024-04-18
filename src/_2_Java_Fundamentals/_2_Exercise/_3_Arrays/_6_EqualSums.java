package _2_Java_Fundamentals._2_Exercise._3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _6_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();

        for (int i = 0; i <= numbers.length - 1 ; i++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex  = 0; leftIndex  < i; leftIndex ++) {
                leftSum += numbers[leftIndex];
            }

            for (int rightIndex = i + 1; rightIndex <= numbers.length -1; rightIndex++) {
                rightSum += numbers[rightIndex];
            }

            if (leftSum == rightSum){
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }
}
