package Exercise.For_Loop;

import java.util.Scanner;

public class _4_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearsOld = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        double evenMoney = 0;
        int toysOdd = 0;
        double botherMoney = 0;

        for (int rd = 1; rd <=yearsOld ; rd++) {
            if (rd % 2 == 0){
                evenMoney += (((double) rd / 2) * 10);
                botherMoney += 1;
            }else {
                toysOdd += 1;
            }
        }
        double toysPrice  =  toysOdd * priceToy;
        double sumPrice = (evenMoney + toysPrice) - botherMoney;

        if (sumPrice >= priceWashingMachine){
            System.out.printf("Yes! %.2f", sumPrice - priceWashingMachine);
        }else {
            System.out.printf("No! %.2f", priceWashingMachine - sumPrice);
        }
    }
}
