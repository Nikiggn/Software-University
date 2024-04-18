package _2_Java_Fundamentals._1_Lab._2_Data_Types_And_Variables;

import java.util.Scanner;

public class _9_CenturiesMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cen  = Integer.parseInt(scanner.nextLine());

        double years= cen * 100;
        double days = years * 365.2422;
        double hours = years * 24L;
        double min = hours *  60;


        System.out.printf("%d centuries = %.0f years = %.0f days = %.0 hours = %.0f minutes",
                cen,
                years,
                days,
                hours,
                min);

    }
}
