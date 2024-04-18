package _3_Java_Advance._1_Lab._1_Stacks_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _2_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] tokens = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = tokens.length - 1; i >= 0 ; i--) {
            stack.push(tokens[i]);
        }

        while(stack.size() > 1){
            int firstNum = Integer.parseInt(stack.pop());
            String op = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());

            switch (op){
                case "+":
                    stack.push(String.valueOf(firstNum + secondNum));
                    break;
                case "-":
                    stack.push(String.valueOf(firstNum - secondNum));
                    break;
            }
        }
        System.out.println(stack.peek());
    }
}
