package _3_Java_Advance._1_Lab._1_Stacks_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _1_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

       while (true){
           String line = scanner.nextLine();
           if (line.equals("Home")){
               break;
           }

           if (!line.equals("back")){
               stack.push(line);
               System.out.println(line);
           }else {
               if (stack.size() <= 1){
                   System.out.println("no previous URLs");
               }else {
                   stack.pop();
                   System.out.println(stack.peek());
               }
           }
       }
    }
}
