package Exercise.For_Loop;

import java.util.Scanner;

public class _6_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int graders = Integer.parseInt(scanner.nextLine());

        double sumPoints = 0;


        for (int i = 1; i <= graders ; i++) {
            String nameGraders = scanner.nextLine();
            double pointsName = Double.parseDouble(scanner.nextLine());
            sumPoints += ((nameGraders.length() * pointsName) / 2);;
        }


        sumPoints += points;
        if (sumPoints > 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, sumPoints);
        }else {
            System.out.printf("Sorry, %s you need %.1f more!", actor, 1250.5 - sumPoints);
        }
    }
}
