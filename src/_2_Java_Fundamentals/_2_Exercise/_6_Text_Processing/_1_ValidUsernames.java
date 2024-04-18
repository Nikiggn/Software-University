package _29_ExerciseTextProcessing;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _1_ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(", ");

        String regex = "^[a-zA-Z0-9\\-_]{3,16}$";
        Pattern pattern = Pattern.compile(regex);

        for (String el1: names) {
            Matcher matcher = pattern.matcher(el1);
            if (matcher.matches()) {
                System.out.println(el1);
            }
        }

    }
}




//if (3 <= el1.length() && el1.length()<= 16){
//                for (int i = 0; i < el1.length(); i++) {
//                    char ch = el1.charAt(i);
//                    if (Character.isDigit(ch)){
//                        fullnme.append(ch);
//                    } else if (Character.isAlphabetic(ch)) {
//                        fullnme.append(ch);
//                    } else if (ch == '-' || ch == '_') {
//                        fullnme.append(ch);
//                    }else {
//                        break;
//                    }
//                }
//                System.out.println(el1);
//            }
