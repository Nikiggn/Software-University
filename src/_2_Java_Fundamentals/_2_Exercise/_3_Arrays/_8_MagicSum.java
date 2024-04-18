package _2_Java_Fundamentals._2_Exercise._3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _8_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();

        int pair = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length ; i++) {
            int firstIndex = numbers[i];

            for (int j = i + 1; j <numbers.length ; j++) {
                int next = numbers[j];
                if (next + firstIndex == pair){
                    System.out.println(firstIndex + " " + next);
                }
            }
        }
    }
}
