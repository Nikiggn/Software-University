package Java_Advance._2_ExercisesStacksandQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _1_ReverseNumberswithaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (String el : input) {
            stack.push(el);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
