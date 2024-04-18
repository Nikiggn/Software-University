import java.util.Scanner;

public class _3_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int numFlower = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (flower){
            case "Roses":
                price = numFlower * 5;
                if (numFlower > 80){
                    price = price - price * 0.1;
                }
                break;
            case "Dahlias":
                price = numFlower * 3.8;
                if (numFlower > 90){
                    price = price - price * 0.15;
                }
                break;
            case "Tulips":
                price = numFlower * 2.8;
                if (numFlower > 80){
                    price = price - price * 0.15;
                }
                break;
            case "Narcissus":
                price = numFlower *  3;
                if (numFlower < 120){
                    price = price + price * 0.15;
                }
                break;
            case "Gladiolus":
                price = numFlower * 2.5;
                if (numFlower < 80){
                    price = price + price * 0.2;
                }
                break;
        }

        if (budget >= price){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlower, flower, budget -price);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }

    }
}
