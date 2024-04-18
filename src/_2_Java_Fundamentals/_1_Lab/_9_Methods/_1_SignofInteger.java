package _14_Methods.b;

import java.util.Scanner;

public class _1_SignofInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int a  = Integer.parseInt(scanner.nextLine());

       checkSign(a);

    }

    public static void checkSign(int a) {
        if (a>0){
            System.out.printf("The number %d is positive.", a);
        }else if (a == 0){
            System.out.printf("The number %d is zero.", a);
        }else {
            System.out.printf("The number %d is negative.", a);
        }

    }


}

