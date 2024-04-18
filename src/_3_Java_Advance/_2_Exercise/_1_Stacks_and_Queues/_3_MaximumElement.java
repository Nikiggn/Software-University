package _3_Java_Advance._2_Exercise._1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _3_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n ; i++) {
            String command = scanner.nextLine();

            switch (command){
                case "2":
                    stack.pop();
                    break;
                case "3":
                    for (int el : stack) {
                        if (el > max){
                            max = el;
                        }
                    }
                    System.out.println(max);
                    break;
                default:
                    int numToPush  = Integer.parseInt(command.split(" ")[1]);
                    stack.push(numToPush);
                    break;
            }
        }
    }
}
