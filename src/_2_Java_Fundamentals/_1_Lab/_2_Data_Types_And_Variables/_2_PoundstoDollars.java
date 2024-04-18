package _2_Java_Fundamentals._1_Lab._2_Data_Types_And_Variables;

import java.util.Scanner;

public class _2_PoundstoDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pound =Double.parseDouble(scanner.nextLine());
        System.out.printf("%.3f", pound * 1.36);
    }
}
