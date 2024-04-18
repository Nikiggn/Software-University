package _2_Java_Fundamentals._2_Exercise._1_Basic;

import java.util.Scanner;

public class _1_Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int year = Integer.parseInt(scanner.nextLine());
        
        if (year <= 2 ){
            System.out.println("baby");
        } else if (year <= 13) {
            System.out.println("child");
        } else if (year <= 19) {
            System.out.println("teenager");
        } else if (year <= 65) {
            System.out.println("adult");
        }else {
            System.out.println("elder");
        }
    }
}
