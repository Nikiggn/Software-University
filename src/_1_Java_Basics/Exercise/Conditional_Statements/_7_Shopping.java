package Exercise.Conditional_Statements;

import java.util.Scanner;

public class _7_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int video = Integer.parseInt(scanner.nextLine());
        int procesors = Integer.parseInt(scanner.nextLine());
        int RAM =  Integer.parseInt(scanner.nextLine());


        double videoPrice = video * 250;

        double procesorPrice= videoPrice * 0.35;
        double sumProcesori = procesorPrice * procesors;

        double RAMprice = videoPrice * 0.1;
        double sumRAM = RAMprice * RAM;

        double sumPrice = videoPrice + sumProcesori + sumRAM;

        if (video > procesors){
            sumPrice = sumPrice - sumPrice * 0.15;
        }

        if (sumPrice <= budget){
            System.out.printf("You have %.2f leva left!", budget - sumPrice);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!", sumPrice - budget);
        }



    }
}