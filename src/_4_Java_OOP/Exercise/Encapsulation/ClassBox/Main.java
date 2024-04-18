package _4_Java_OOP.Exercise.Encapsulation.ClassBox;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double l = Double .parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        Box box = new Box(l, w, h);

        System.out.printf("Surface Area - %.2f\n",box.calculateSurfaceArea());
        System.out.printf("Lateral Surface Area - %.2f\n",box.calculateLateralSurfaceArea());
        System.out.printf("Volume - %.2f",box.calculateVolume());
    }
}
