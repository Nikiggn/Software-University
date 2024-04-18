package Exercise.For_Loop;

import java.util.Scanner;

public class _5_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int openTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int priceSite = 0;

        for (int i = 1; i <= openTabs ; i++) {
            String siteName = scanner.nextLine();

            if (siteName.equals("Facebook")){
                priceSite += 150;
            } else if (siteName.equals("Instagram")) {
                priceSite += 100;
            }else if (siteName.equals("Reddit")){
                priceSite += 50;
            }
        }
        int sum = salary - priceSite;
        if (sum <= 0){
            System.out.println("You have lost your salary.");
        }else {
            System.out.println(salary - priceSite);
        }

    }
}
