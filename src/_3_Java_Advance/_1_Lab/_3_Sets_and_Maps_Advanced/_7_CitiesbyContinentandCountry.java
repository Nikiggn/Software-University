package _3_Java_Advance._1_Lab._3_Sets_and_Maps_Advanced;

import java.util.*;

public class _7_CitiesbyContinentandCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> byContinent = new LinkedHashMap<>();
        Map<String, List<String>> byCountry = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n ; i++) {
            String[] parts = scanner.nextLine().split("\\s+");
            String continent = parts[0];
            String country = parts[1];

            String town = parts[2];

            byContinent.putIfAbsent(continent,new ArrayList<>());
            byContinent.get(continent).add(country);


            for (String el: byContinent.get(continent)) {
                byCountry.putIfAbsent(el, new ArrayList<>());
                byCountry.get(el).add(town);
            }

        }




        System.out.println();
    }
}
