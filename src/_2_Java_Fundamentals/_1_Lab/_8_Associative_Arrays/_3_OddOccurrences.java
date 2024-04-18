package _23_AssociativeArrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _3_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> e.toLowerCase())
                .toArray(String[]::new);


        LinkedHashMap<String, Integer> wordMap = new LinkedHashMap<>();


        for (String word: words) {
            if (wordMap.containsKey(word)){
                wordMap.put(word, wordMap.get(word) + 1);
            }else {
                wordMap.put(word, 1);
            }
        }

        String[] result = wordMap
                .entrySet()
                .stream()
                .filter(w -> w.getValue() % 2 != 0)
                .map(entry -> entry.getKey())
                .toArray(String[]::new);


        System.out.println(String.join(", ", result));


    }
}
