package _2_Java_Fundamentals._1_Lab._3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int[] numbers  = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

//        String value = scanner.nextLine();
//        String[] items = value.split(" ");
//
//        int[] arr = new int[items.length];
//        for (int i = 0; i <items.length ; i++) {
//            arr[i] = Integer.parseInt(scanner.nextLine());
//        }
    }
}
