package _15_ExercisesMethods;

import java.util.Scanner;

public class _3_CharactersinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);

        if(b < a){
            String text = "";
            for (char i = (char) (b +1); i < a; i++) {
                text += i + " ";
            }
            System.out.println(text);
            return;
        }
        System.out.println(charsBetween(a, b));

    }

    public static String charsBetween(char a, char b) {
        String text = "";

        for (char i = (char) (a + 1); i < b; i++) {
                text += i + " ";
        }
        return text;
    }
}
