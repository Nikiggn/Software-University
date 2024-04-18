package _2_Java_Fundamentals._1_Lab._2_Data_Types_And_Variables;

import java.util.Scanner;

public class _4_TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", name, population, area);
    }
}
