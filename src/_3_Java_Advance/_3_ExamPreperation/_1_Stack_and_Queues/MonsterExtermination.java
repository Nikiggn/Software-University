package _3_Java_Advance._3_ExamPreperation._1_Stack_and_Queues;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MonsterExtermination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> armor = readSequence(scanner);
        Deque<Integer> soldier = readSequence(scanner);
        int[] count = {0};
        process(armor, soldier, count);
        printResult(armor, soldier, count[0]);
    }

    private static Deque<Integer> readSequence(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));
    }

    private static void process(Deque<Integer> armors, Deque<Integer> soldiers, int[] count) {
        while (!armors.isEmpty() && !soldiers.isEmpty()) {
            int armor = armors.pop();
            int strike = soldiers.pollLast();

            if (strike >= armor) {
                count[0]++;
                strike -= armor;
                if (strike > 0) {
                    if (!soldiers.isEmpty()) {
                        int newVal = soldiers.pop() + strike;
                        soldiers.push(newVal);
                    } else {
                        soldiers.push(strike);
                    }
                }
            } else {
                armor -= strike;
                armors.push(armor);
            }
        }
    }

    private static void printResult(Deque<Integer> armors, Deque<Integer> soldiers, int count) {
        if (armors.isEmpty()) {
            System.out.println("All monsters have been killed!");
        }

        if (soldiers.isEmpty()) {
            System.out.println("The soldier has been defeated.");
        }

        System.out.printf("Total monsters killed: %d", count);
    }
}


