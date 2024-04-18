package Exercise.Conditional_Statements;

import java.util.Scanner;
public class _6_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double secRecord = Double.parseDouble(scanner.nextLine());
        double metrDistance = Double.parseDouble(scanner.nextLine());
        double secPerMetre = Double.parseDouble(scanner.nextLine());

        double sumSec = metrDistance * secPerMetre;
        double addSec = Math.floor(metrDistance / 15) * 12.5;
        double finalSec = (sumSec + addSec);

        if (finalSec < secRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalSec);
        } else if (finalSec >= secRecord) {
            double diff = Math.abs(finalSec - secRecord);
            System.out.printf("No, he failed! He was %.2f seconds slower.",diff);
        }
    }
}

