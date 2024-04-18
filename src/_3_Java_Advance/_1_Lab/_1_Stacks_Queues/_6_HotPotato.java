package _3_Java_Advance._1_Lab._1_Stacks_Queues;
import java.util.ArrayDeque;
import java.util.Scanner;


public class _6_HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String names = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        String[] arr = names.split(" ");
        for (String s : arr) {
            queue.offer(s);
        }

        while(queue.size() > 1){

            queue.offer(queue.poll());//////vajno

            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is " + queue.peek());
    }
}
