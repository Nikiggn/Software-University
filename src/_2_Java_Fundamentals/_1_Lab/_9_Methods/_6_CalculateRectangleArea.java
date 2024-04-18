package _14_Methods.b;

import java.util.Scanner;

public class _6_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int a  = Integer.parseInt(scanner.nextLine());
       int b = Integer.parseInt(scanner.nextLine());

        System.out.println(area(a, b));

    }

    public static int area(int a, int b){
        return a * b;
    }
}
