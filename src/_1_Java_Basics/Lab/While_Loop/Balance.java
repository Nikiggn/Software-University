package Lab.While_Loop;

import java.util.Scanner;

public class Balance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;

        while (true){
           String command = scanner.nextLine();
           if (command.equals("NoMoreMoney")){
               break;
           }

           double num  = Double.parseDouble(command);
           total += num;
            System.out.printf("Increase: %.2f\n", num);
        }
        System.out.printf("Total: %.2f", total);
    }
}
