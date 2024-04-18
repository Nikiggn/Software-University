package _6_BasicsMOREexercise;

import java.util.Scanner;

public class _3_GamingStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());

        double totalPrice= 0 ;
        String command = scanner.nextLine();


        while (!command.equals("Game Time")){
            String game = scanner.nextLine();

            //if (!game.equals("OutFall 4") || !game.equals("CS: OG") || !game.equals("Zplinter Zell ") ||!game.equals("Honored 2") ||!game.equals("RoverWatch")){

            //}


            switch (game) {
                case "OutFall 4" -> balance -= 39.99;
                case "CS: OG" -> balance -= 15.99;
                case "Zplinter Zell" -> balance -= 19.99;
                case "Honored 2" -> balance -= 59.99;
                case "RoverWatch" -> balance -= 29.99;
                case "RoverWatch Origins Edition" -> balance -= 39.99;
            }



        }

    }
}
