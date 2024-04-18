package _3_Java_Advance._3_ExamPreperation._1_Stack_and_Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class MagicBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Deque<Integer> firstMagicBox =new ArrayDeque<>();
        Deque<Integer> secondMagicBox =new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(firstMagicBox::offer);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(secondMagicBox::push);

        int sum = 0;

        while(true){
            int firstItem = firstMagicBox.pop();
            int secondItem = secondMagicBox.pop();

            if ((firstItem + secondItem) % 2 == 0){
                sum += firstItem + secondItem;
            }
            else {
                firstMagicBox.push(firstItem);
                firstMagicBox.offer(secondItem);
            }

            if (firstMagicBox.isEmpty()){
                System.out.println("First magic box is empty.");
                break;
            }else if (secondMagicBox.isEmpty()){
                System.out.println("Second magic box is empty.");
                break;
            }
        }

        if (sum >= 90){
            System.out.printf("Wow, your prey was epic! Value: %d", sum);
        }else {
            System.out.printf("Poor prey... Value: %d", sum);
        }




    }
}
