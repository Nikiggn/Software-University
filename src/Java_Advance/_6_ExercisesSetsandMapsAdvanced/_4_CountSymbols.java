package Java_Advance._6_ExercisesSetsandMapsAdvanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _4_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arr = scanner.nextLine();
        Map<Character, Integer> data = new TreeMap<>();

        for (int i = 0; i < arr.length(); i++) {
            char ch = arr.charAt(i);

            if (data.containsKey(ch)) {
                data.put(ch, data.get(ch) + 1);
            } else {
                data.put(ch, 1);
            }
        }
        data.forEach((k, v) -> {
            System.out.printf("%c: %d time/s%n", k, v);
        });
    }
}
