package Java_Advance._1_StacksQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _5_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<String> queue = new ArrayDeque<>();

        while (true){
            String filenames = scanner.nextLine();
            if (filenames.equals("print")){
                break;
            }
            if (filenames.equals("cancel")){
                if (queue.size()<1){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.println("Canceled " + queue.peek() );
                    queue.poll();
                }
            } else {
                queue.offer(filenames);
            }
        }
        for (String el1:queue) {
            System.out.println(el1);
        }
    }
}
