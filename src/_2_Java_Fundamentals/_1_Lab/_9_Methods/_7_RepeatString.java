package _14_Methods.b;

import java.util.Scanner;

public class _7_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int repeats = Integer.parseInt(scanner.nextLine());

        String result = repeatString(text, repeats);

        System.out.println(result);
    }

    public static String repeatString(String text, int repeats) {
        String[] result = new String[repeats];

        for (int i = 0; i < repeats; i++) {
            result[i] = text;
        }
        return String.join("", result);
    }
}
