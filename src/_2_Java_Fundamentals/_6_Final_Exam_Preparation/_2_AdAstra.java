package _35_FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _2_AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
//        the food and calculate the total calories.
        ///(#|\|)(?<food>[A-Za-zs]+)\1(?<experationalDate>[0-9]{2}\/[0-9]{2}\/[0-9]{2})\1(?<cal>[0-9]{0,5})\1
        String regex  = "(#|\\|)(?<food>[A-Za-zs]+)\\1(?<experationalDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<cal>[0-9]{0,5})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);



    }
}
