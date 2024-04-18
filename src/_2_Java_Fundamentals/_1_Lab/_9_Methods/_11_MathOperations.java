package _14_Methods.b;

import java.awt.event.WindowAdapter;
import java.util.Scanner;

public class _11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        String operators = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());
        int result = calculation( a, operators, b);
        System.out.println(result);

    }

    public static int calculation(int a, String operators, int b){
        int result =0;
        if (operators.equals("*")){
            result = a*b;
        } else if (operators.equals("+")) {
            result = a + b;
        }else {
            result = a - b;
        }
        return result;
    }
}
