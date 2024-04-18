package _20_MidExamPreparation;

import java.util.Scanner;

public class _2_MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitCoins = 0;
        boolean isAlive = true;

        String[] rooms = (scanner.nextLine().split("\\|"));

        //command
        //number

        for (int i = 0; i < rooms.length; i++) {
            String[] eachRoom = rooms[i].split(" ");

            String command = eachRoom[0];
            int number = Integer.parseInt(eachRoom[1]);

            switch (command) {
                case "potion":

                    int healtbeforehealing = health;
                    health = Math.min(health + number, 100);
                    System.out.printf("You healed for %d hp.%n", health - healtbeforehealing);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;

                case "chest":
                    bitCoins += number;
                    System.out.printf("You found %d bitcoins.%n", number);
                    break;

                default:

                    health -= number;
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", command);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", i + 1);
                        isAlive = false;
                        return;
                    }
                    break;
            }
            if (!isAlive) {
                break;
            }

        }
        if (isAlive) {
            System.out.printf("You've made it!%n");
            System.out.printf("Bitcoins: %d%n", bitCoins);
            System.out.printf("Health: %d%n", health);
        }
    }
}
