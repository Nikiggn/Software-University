package _2_Java_Fundamentals._1_Lab._3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _7_CondenseArraytoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();

        int[] temp = new int[numbers.length];
        for (int b = 0; b < numbers.length ; b++) {
            temp[b] = numbers[b];
        }

        for (int i = 0; i < numbers.length -1 ; i++) {
            int[] cur = new int[temp.length -1];
            for (int j = 0; j <= cur.length -1 ; j++) {
                cur[j] = temp[j] + temp[j+1];
            }
            temp =cur;
        }
        System.out.println(temp[0]);



    }
}
