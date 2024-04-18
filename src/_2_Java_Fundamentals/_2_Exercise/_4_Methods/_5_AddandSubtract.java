package _15_ExercisesMethods;

import java.util.Scanner;

public class _5_AddandSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(subtract(a,b,c));
    }

    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static int subtract(int a, int b, int c){
        int sumum =sum(a,b) - c;
        return sumum;
    }
}
