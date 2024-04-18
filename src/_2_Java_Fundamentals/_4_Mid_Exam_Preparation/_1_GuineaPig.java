package _20_MidExamPreparation;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _1_GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodGrams = Double.parseDouble(scanner.nextLine()) * 1000;
        double hayGrams = Double.parseDouble(scanner.nextLine()) * 1000;
        double coverGrams = Double.parseDouble(scanner.nextLine()) * 1000;
        double weightGrams = Double.parseDouble(scanner.nextLine()) * 1000;

        for (int i = 1; i <= 30; i++) {
            foodGrams -= 300;
            if (i % 2 == 0) {
                double neededHay = foodGrams * 0.05;
                hayGrams -= neededHay;
            }

            DecimalFormat df = new DecimalFormat("#.##");

            if (i % 3 == 0) {
                double neededCover = weightGrams / 3;
                coverGrams -= neededCover;
            }

            if (foodGrams <= 0 || hayGrams <= 0 || coverGrams <= 0 || weightGrams <= 0) {
                System.out.println("Merry must go to the pet store!");
                break;
            }
        }

        if (foodGrams > 0 && hayGrams > 0 && coverGrams > 0) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",foodGrams / 1000, hayGrams/ 1000, coverGrams/ 1000);
        }


    }

}
