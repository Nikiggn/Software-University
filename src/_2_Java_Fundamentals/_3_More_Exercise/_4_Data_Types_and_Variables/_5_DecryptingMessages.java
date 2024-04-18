package _2_Java_Fundamentals._3_More_Exercise._4_Data_Types_and_Variables;

import java.util.Scanner;

public class _5_DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= lines ; i++) {
            char symbol =scanner.nextLine().charAt(0);
            int newSymbol = symbol + key;
            char newChar = (char) newSymbol;
            System.out.print(newChar);
        }
    }
}
