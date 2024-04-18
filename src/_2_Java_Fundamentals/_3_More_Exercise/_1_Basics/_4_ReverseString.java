package _6_BasicsMOREexercise;

import java.util.Scanner;

public class _4_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String pass = "";

        for (int i = name.length() -1 ; i >= 0; i--) {
            char lastChar = name.charAt(i);
            pass += lastChar;

        }

        System.out.println(pass);
    }
}
