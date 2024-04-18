package _2_Java_Fundamentals._1_Lab._3_Arrays;

import java.util.Scanner;

public class _4_ReverseanArrayofStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");
        String[] reverse = new String[elements.length];

        int reverseIndex  = 0;

        for (int i = elements.length - 1;  i >= 0 ; i--) {
            reverse[reverseIndex] = elements[i];
            reverseIndex +=1;
        }
        System.out.println(String.join(" ", reverse));

    }
}
