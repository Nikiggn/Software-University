package _3_Java_Advance._3_ExamPreperation._1_Stack_and_Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Lootbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> firstLootBox = new ArrayDeque<>();
        Deque<Integer> secondLootBox = new ArrayDeque<>();

        String[] parts1 = scanner.nextLine().split(" ");
        String[] parts2 = scanner.nextLine().split(" ");

        for (int i = 0; i < parts1.length ; i++) {
            firstLootBox.add(Integer.parseInt(parts1[i]));
        }
        for (int i = parts2.length - 1; i >= 0 ; i--) {
            secondLootBox.add(Integer.parseInt(parts2[i]));
        }

        int sum = 0;

        while (true){

            if (firstLootBox.isEmpty()){
                System.out.println("First lootbox is empty");
                if (sum >= 100){
                    System.out.printf("Your loot was epic! Value: %d%n", sum);
                }else {
                    System.out.printf("Your loot was poor... Value: %d%n", sum);
                }
                break;
            } else if (secondLootBox.isEmpty()) {
                System.out.println("Second lootbox is empty");
                if (sum >= 100){
                    System.out.printf("Your loot was epic! Value: %d%n", sum);
                }else {
                    System.out.printf("Your loot was poor... Value: %d%n", sum);
                }
                break;
            }
            int nums = firstLootBox.peek() + secondLootBox.peek();

            if (nums % 2 == 0){
                sum += firstLootBox.peek() + secondLootBox.peek();
                firstLootBox.poll();
                secondLootBox.poll();
            }else {
                firstLootBox.offer(secondLootBox.poll());
            }

        }
    }
}
