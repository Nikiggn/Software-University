package _2_Java_Fundamentals._2_Exercise._2_Data_Types_and_Variables;

import java.util.Scanner;

public class _11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowBalls = Integer.parseInt(scanner.nextLine());
        double highestValue = Double.MIN_VALUE;

        int snow = 0, timeSnow= 0, quality = 0;


        for (int i = 0; i < snowBalls; i++) {
            int currentSnow = Integer.parseInt(scanner.nextLine());
            int currentTime = Integer.parseInt(scanner.nextLine());
            int currentQuality = Integer.parseInt(scanner.nextLine());

            double currentSnowballValue = Math.pow(currentSnow / (double)currentTime, currentQuality);

            if (currentSnowballValue > highestValue) {
                highestValue = currentSnowballValue;
                snow = currentSnow;
                timeSnow = currentTime;
                quality = currentQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snow, timeSnow, highestValue,quality );
    }
}
