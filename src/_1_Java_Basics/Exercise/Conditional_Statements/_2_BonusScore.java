package Exercise.Conditional_Statements;

import java.util.Scanner;

public class _2_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double points = 0;

        if (a <= 100){
             points =  5;
        } else if (a > 100 & a <= 1000) {
             points = a * 0.2;
        }else {
             points = a * 0.1;
        }

        if (a % 2 == 0){
             points = points + 1;
        }else if (a % 10 == 5){
            points = points + 2;
        }

        System.out.println(points);
        System.out.println(points + a);
    }
}

