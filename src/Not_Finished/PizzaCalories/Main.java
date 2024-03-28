package Not_Finished.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaParts = scanner.nextLine().split(" ");
        String pizzaName = pizzaParts[1];
        String numberOfToppings = pizzaParts[2];

        String[] doughParts = scanner.nextLine().split(" ");
        String  flourType = doughParts[1];
        String bakingTechnique = doughParts[2];
        double weightInGrams = Double.parseDouble(doughParts[3]);


        String command = scanner.nextLine();
        while (!"END".equals(command)){
            String[] toppingParts = command.split(" ");
            String toppingType = toppingParts[1];
           // double weightGrams = Double.parseDouble(toppingType[2]);


            command = scanner.nextLine();
        }


    }
}
