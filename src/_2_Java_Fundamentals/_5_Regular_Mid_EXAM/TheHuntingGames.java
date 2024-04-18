package _20_RegularMidEXAM;

import java.util.Scanner;

public class TheHuntingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int players = Integer.parseInt(scanner.nextLine());
        double groupEnergy = Double.parseDouble(scanner.nextLine());
        double waterPerDay = Double.parseDouble(scanner.nextLine());
        double foodPerDay = Double.parseDouble(scanner.nextLine());

        double wholeFood = days * players * foodPerDay;
        double wholeWater = days * players * waterPerDay;

        boolean yeaNo = true;


        for (int i = 1; i <= days; i++) {
            double energyLoss = Double.parseDouble(scanner.nextLine());
            groupEnergy -= energyLoss;
            if (groupEnergy <= 0) {
                yeaNo = false;
                break;
            }

            if (i % 2 == 0) {
                wholeWater = wholeWater - wholeWater * 0.3;
                groupEnergy = groupEnergy + groupEnergy * 0.05;
            }

            if (i % 3 == 0) {
                wholeFood = wholeFood - (wholeFood / players);
                groupEnergy = groupEnergy + groupEnergy * 0.1;
            }
        }
        if (yeaNo){
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", groupEnergy);
        }else {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", wholeFood, wholeWater);
        }
    }
}
