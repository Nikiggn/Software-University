import java.util.Scanner;

public class _4_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherMans = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (season){
            case "Spring":
                price = 3000;
                if (fisherMans <= 6){
                    price = price - price * 0.1;
                } else if (fisherMans >7 && fisherMans <= 11) {
                    price =price - price *0.15;
                }else {
                    price = price - price * 0.25;
                }
                break;

            case "Summer":
                price = 4200;
                if (fisherMans <= 6){
                    price = price - price * 0.1;
                } else if (fisherMans >7 && fisherMans <= 11) {
                    price =price - price *0.15;
                }else {
                    price = price - price * 0.25;
                }
                break;
            case "Autumn":
                price = 4200;
                if (fisherMans <= 6){
                    price = price - price * 0.1;
                } else if (fisherMans >7 && fisherMans <= 11) {
                    price =price - price *0.15;
                }else {
                    price = price - price * 0.25;
                }
                break;

            case "Winter":
                price = 2600;
                if (fisherMans <= 6){
                    price = price - price * 0.1;
                } else if (fisherMans >7 && fisherMans <= 11) {
                    price =price - price *0.15;
                }else {
                    price = price - price * 0.25;
                }
                break;
        }
        if (!"Autumn".equals(season) && fisherMans % 2 == 0){
            price = price - price * 0.05;
        }
        if (budget >= price){
            System.out.printf("Yes! You have %.2f leva left.", budget-price);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", price -budget);
        }
    }
}
