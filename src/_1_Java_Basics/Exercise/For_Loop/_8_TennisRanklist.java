package Exercise.For_Loop;

import java.util.Scanner;

public class _8_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;

        int wins = 0;

        for (int i = 1; i <=tournaments ; i++) {
            String etap = scanner.nextLine();

            if (etap.equals("F")){
                points += 1200;
            } else if (etap.equals("SF")) {
                points += 720;
            }else  {
                points += 2000;
                ++wins;
            }
        }
        startingPoints += points;
        double averagePoints = (double) points / tournaments;
        double percent = ((double) wins / tournaments) * 100;

        System.out.printf("Final points: %d%n",startingPoints);
        System.out.printf("Average points: %.0f%n",Math.floor(averagePoints));
        System.out.printf("%.2f%%", percent);
    }
}
