package Exercise.Conditional_Statements;

import java.util.Scanner;

public class _4_ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double trip = Double.parseDouble(scanner.nextLine());
        int puzels = Integer.parseInt(scanner.nextLine());
        int dols = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int camionc = Integer.parseInt(scanner.nextLine());

        int sumToys = puzels + dols + bears + minions + camionc;

        double PricePuzzles = puzels * 2.60;
        double dolsPrice = dols * 3.0;
        double bearsPrice = bears * 4.10;
        double minionsPrice = minions * 8.20;
        double camionicPrice= camionc * 2.0;

        double profit =  PricePuzzles + dolsPrice + bearsPrice +minionsPrice + camionicPrice;
        profit = profit - profit * 0.1;
        if (sumToys >= 50){
            profit =  profit - profit * 0.25;
        }

        if (trip > profit){
            System.out.printf("Not enough money! %.2f lv needed.", trip - profit );

        }else {
            System.out.printf("Yes! %.2f lv left.", profit - trip);

        }
    }
}
