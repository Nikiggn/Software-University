package Lab.While_Loop;

import java.util.Scanner;

public class Biggest_Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        while (true){
            String com = scanner.nextLine();
            if (com.equals("Stop")){
                break;
            }
            int num  = Integer.parseInt(com);
            if (num > max){
                max = num;
            }
        }
        System.out.println(max);
    }
}
