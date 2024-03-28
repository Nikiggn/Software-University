package Java_Advance._6_ExercisesSetsandMapsAdvanced;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _3_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> chemicals = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            chemicals.addAll(Arrays.asList(scanner.nextLine().split(" ")));
        }
        for (String el : chemicals) {
            System.out.print(el + " ");
        }
    }
}
