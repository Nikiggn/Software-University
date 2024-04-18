package _14_Methods.b;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _8_MathPowe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        double result = raisedNumber(number, power);
        System.out.println(new DecimalFormat("0.####").format(result));
    }

    public static double raisedNumber(double number, double power){

        double result  = Math.pow(number, power);
        return result;
    }
}
