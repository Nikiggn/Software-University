package _35_FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _2_DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String locations = scanner.nextLine();
        List<String> loc = new ArrayList<>();

        String regex = "(=|\\/)(?<dest>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(locations);

        int sum = 0;

        while (matcher.find()){
            String dest = matcher.group("dest");
            sum += dest.length();
            loc.add(dest);
        }

        int count = 0;
        System.out.print("Destinations: ");
        for (String el1: loc) {
            count++;
            System.out.print(el1);
            if (count < loc.size()){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Travel Points: " + sum);
    }
}
