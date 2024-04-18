package _2_Java_Fundamentals._2_Exercise._2_Data_Types_and_Variables;

import java.util.Scanner;

public class _2_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = a;

        int sum = 0;

        while (a > 0){
            int lastDigits = a % 10;
            sum += lastDigits;
            a = a / 10;
        }
        System.out.println(sum);
    }
}
