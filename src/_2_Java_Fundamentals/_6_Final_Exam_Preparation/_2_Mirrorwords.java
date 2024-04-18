package _35_FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _2_Mirrorwords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "(@|#)(?<word1>[A-Za-z]{3,})\\1\\1(?<word2>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        StringBuilder finalAnswer  = new StringBuilder();
        LinkedHashMap<String, String> info = new LinkedHashMap<>();

        int matchWords = 0;
        boolean foundmaches = false;

        while (matcher.find()){
            matchWords += 1;
            foundmaches = true;
            String word1 = matcher.group("word1");
            String word2 = matcher.group("word2");

            String reversed = new StringBuilder(word2).reverse().toString();

            if (reversed.equals(word1)){
                info.put(word1, word2);
            }
        }

        int count  = 0;
        if (foundmaches){
            System.out.printf("%d word pairs found!%n", matchWords);
            if (!info.isEmpty()){
                System.out.printf("The mirror words are:%n");
                for (Map.Entry<String, String> entry: info.entrySet()) {
                    count++;
                    System.out.printf("%s <=> %s" ,entry.getKey(), entry.getValue());
                    if (count <info.size()){
                        System.out.print(", ");
                    }
                }
            }else {
                System.out.println("No mirror words!");
            }

        }else {
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        }
    }
}
