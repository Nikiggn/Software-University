package _2_Java_Fundamentals._2_Exercise._1_Basic;

import java.util.Scanner;

public class _6_StrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int num1 = num;

        int sum = 0;

        while ( num >0 ){
            int lastDigit = num % 10;

            int fact = 1;
            for (int i = 1; i <= lastDigit ; i++) {
                fact = fact * i;
            }

            sum += fact;
            num = num / 10;
        }

        if (sum == num1){
            System.out.println("Yes");
        }else {
            System.out.println("No"  );
        }
    }
}
