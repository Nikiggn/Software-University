package _3_Java_Advance._2_Exercise._1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _2_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack =new ArrayDeque<>();

        String[] parts = scanner.nextLine().split(" ");
        int elToPush = Integer.parseInt(parts[0]);
        int elToPop = Integer.parseInt(parts[1]);
        int elToCheck = Integer.parseInt(parts[2]);

        int small = Integer.MAX_VALUE;

        String[] nums = scanner.nextLine().split("\\s+");
        for (int i = 0; i < elToPush ; i++) {
            stack.push(Integer.parseInt(nums[i]));
        }
        for (int i = 0; i < elToPop ; i++) {
            stack.pop();
        }


        if (stack.contains(elToCheck)){
            System.out.println("true");
        } else if (stack.isEmpty()) {
            System.out.println(0);
        } else {
            for (int el: stack) {
                if (el < small){
                    small= el;
                }
            }
            System.out.println(small);
        }
    }
}
