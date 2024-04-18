package _2_Java_Fundamentals._1_Lab._6_Text_Processing;

import java.util.Arrays;
import java.util.Scanner;

public class _4_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banned = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String el1: banned) {
            char[] replansca = new char[banned.length];
            Arrays.fill(replansca, '*');
            String repl = new String(replansca);
            text = text.replace(el1, repl);
        }
        System.out.println(text);

    }
}
