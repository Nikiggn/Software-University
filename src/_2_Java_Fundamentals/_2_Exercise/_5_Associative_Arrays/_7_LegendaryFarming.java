package _24_ExerciseAssociativeArrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class _7_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	"Shadowmourne" - requires 250 Shards
        //•	"Valanyr" - requires 250 Fragments
        //•	"Dragonwrath" - requires 250 Motes

        String[] format = Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> e.toLowerCase())
                .toArray(String[]::new);

        LinkedHashMap<String, Integer> info = new LinkedHashMap<>();
    }
}
