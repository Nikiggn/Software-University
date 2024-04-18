package _2_Java_Fundamentals._2_Exercise._1_Basic;

import java.util.Scanner;

public class _2_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num  = Integer.parseInt(scanner.nextLine());

        if (num % 10 == 0){
            System.out.println("The number is divisible by 10");
        } else if (num % 10 == 0 && num% 2 == 0) {
            System.out.println();

        }
    }
}
