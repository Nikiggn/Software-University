package _3_Java_Advance._1_Lab._1_Stacks_Queues;

import java.util.PriorityQueue;
import java.util.Scanner;

public class _7_MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        PriorityQueue<String> queue = new PriorityQueue<>();
        String text = scanner.nextLine();
        String[] arr = text.split(" ");

        for (String el1: arr) {
            queue.offer(el1);
        }

    }
}
