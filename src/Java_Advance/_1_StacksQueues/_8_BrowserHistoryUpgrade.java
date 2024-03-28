package Java_Advance._1_StacksQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _8_BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();

        while(true){
            String url = scanner.nextLine();
            if (url.equals("Home")){
                break;
            }

            switch (url){
                case "back":
                    if (stack.size() <= 1){
                        System.out.println("no previous URLs");
                    }else {
                        forward.push(stack.pop());
                        System.out.println(stack.peek());
                    }
                    break;

                case "forward":
                    if (forward.isEmpty()){
                        System.out.println("no next URLs");
                    }else {
                        stack.push(forward.pop());
                        System.out.println(stack.peek());
                    }
                    break;

                default:
                    stack.push(url);
                    forward.clear();
                    System.out.println(url);
                    break;

            }
        }

//        for (String el : stack) {
//            System.out.println(el);
//        }
    }
}
