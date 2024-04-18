package _2_Java_Fundamentals._2_Exercise._2_Data_Types_and_Variables;

import java.util.Scanner;

public class _8_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double previous = 0;

        String biggr = "";

        for (int i = 1; i <= n ; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int  height = Integer.parseInt(scanner.nextLine());

             double volume = Math.PI * (radius *radius) * height;

             if (volume > previous){
                 previous = volume;
                 biggr = model;
             }
        }

        System.out.printf(biggr);


    }
}
