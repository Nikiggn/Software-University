package Lab.While_Loop;

import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        while (true){
            String com = scanner.nextLine();
            if (com.equals("Stop")){
                break;
            }
            int num  = Integer.parseInt(com);
            if (num < min){
                min = num;
            }
        }
        System.out.println(min);
    }
}
