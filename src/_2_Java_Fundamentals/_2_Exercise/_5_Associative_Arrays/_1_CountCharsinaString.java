package _24_ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _1_CountCharsinaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();


        LinkedHashMap<Character, Integer> symbolsCount = new LinkedHashMap<>();


        for (char el1: text.toCharArray()) {

            if (el1 == ' '){
                continue;
            }
             if ( symbolsCount.containsKey(el1)) {
                symbolsCount.put(el1,symbolsCount.get(el1) + 1);
            }else {
                symbolsCount.put(el1 , 1);
            }
        }

        for (Map.Entry<Character, Integer> entry: symbolsCount.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
