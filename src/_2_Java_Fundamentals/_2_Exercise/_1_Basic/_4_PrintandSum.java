package _2_Java_Fundamentals._2_Exercise._1_Basic;

import java.util.Scanner;

public class _4_PrintandSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = a; i <=b ; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.printf("%nSum: " +  sum);
    }
}
