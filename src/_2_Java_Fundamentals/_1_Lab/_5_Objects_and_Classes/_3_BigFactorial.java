package _2_Java_Fundamentals._1_Lab._5_Objects_and_Classes;

import java.math.BigInteger;
import java.util.Scanner;

public class _3_BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigInteger result = BigInteger.valueOf(1);

        for (int i = 1; i <=n  ; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println( result);
    }
}
