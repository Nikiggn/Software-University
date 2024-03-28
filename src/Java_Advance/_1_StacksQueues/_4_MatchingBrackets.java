package Java_Advance._1_StacksQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _4_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression  = scanner.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < expression.length() ; i++) {
            char cur = expression.charAt(i);

            if ('(' == cur){
                stack.push(i);
            } else if (')' == cur) {
                String match = expression.substring(stack.pop(), i+1);
                System.out.println(match);
            }
        }
    }
}
