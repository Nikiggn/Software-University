package _2_Java_Fundamentals._1_Lab._2_Data_Types_And_Variables;

import java.util.Scanner;

public class _1_ConvertMetersKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int metres  = Integer.parseInt(scanner.nextLine());
        double km = (double) metres / 1000;

        System.out.printf("%.2f", km);
    }
}
