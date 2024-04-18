package _2_Java_Fundamentals._3_More_Exercise._4_Data_Types_and_Variables;

import java.util.Scanner;

public class _6_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= lines ; i++) {
            String input = scanner.nextLine();
            if (input.equals("(")){
                sum1 += 1;
            } else if (input.equals(")")) {
                sum2 += 1;
            }
        }
        if (sum1 == sum2){
            System.out.println("BALANCED");
        }else {
            System.out.println("UNBALANCED");
        }


    }
}
