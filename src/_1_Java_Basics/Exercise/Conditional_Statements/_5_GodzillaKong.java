package Exercise.Conditional_Statements;

import java.util.Scanner;

public class _5_GodzillaKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budjet = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double clothPrice = Double.parseDouble(scanner.nextLine());

        double decor = budjet * 0.1;

        if (statist > 150){
            clothPrice = clothPrice - clothPrice * 0.1;
        }
        double clothes = clothPrice * statist;
        double sumPrice = clothes + decor;

        if (sumPrice > budjet){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", sumPrice - budjet);
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budjet - sumPrice);
        }
    }
}
