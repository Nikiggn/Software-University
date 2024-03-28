package Java_Advance._2_ExercisesStacksandQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class _9_PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] pesticides = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] days = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        int maxDays = 0;

        for (int i = 0; i < n; i++) {
            int currentDays = 0;

            while (!stack.isEmpty() && pesticides[i] <= pesticides[stack.peek()]) {
                currentDays = Math.max(currentDays, days[stack.pop()]);
            }

            if (!stack.isEmpty()) {
                days[i] = currentDays + 1;
            }

            maxDays = Math.max(maxDays, days[i]);
            stack.push(i);
        }

        System.out.println(maxDays);
    }
}



