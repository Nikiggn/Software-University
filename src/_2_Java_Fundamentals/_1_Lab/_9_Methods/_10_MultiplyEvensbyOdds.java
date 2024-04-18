package _14_Methods.b;

import java.util.Arrays;
import java.util.Scanner;

public class _10_MultiplyEvensbyOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Math.abs(Integer.parseInt(scanner.nextLine()));
        int results = multipleEven(num);

        System.out.println(results);

    }

    public static int multipleEven(int num){
        int sumEven = 0;
        int sumOdd = 0;

        int[] nums = new int[num];

        for (int i = 0; i <nums.length; i++) {

            int lastDigit = num % 10;
            if (lastDigit % 2 == 0){
                sumEven += lastDigit;
            }else {
                sumOdd += lastDigit;
            }
            num = num /10;
        }

        return  sumOdd * sumEven;
    }


}
