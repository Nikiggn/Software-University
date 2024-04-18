package _2_Java_Fundamentals._3_More_Exercise._4_Data_Types_and_Variables;

import java.util.Scanner;

public class _3_FloatingEquality {
    public static boolean areEqual(double a, double b, double epsilon) {
        return Math.abs(a - b) < epsilon;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       double a = Double.parseDouble(scanner.nextLine());
       double b = Double.parseDouble(scanner.nextLine());
       double eps = 0.000001;

        if (areEqual(a, b, eps)) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
