package _2_Java_Fundamentals._1_Lab._5_Objects_and_Classes;

import java.math.BigInteger;
import java.util.Scanner;

public class _2_SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger n = new BigInteger(scanner.nextLine());
        BigInteger a =new BigInteger(scanner.nextLine());
        BigInteger result = a.add(n) ;
        System.out.println(result);

    }
}
