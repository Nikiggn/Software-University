package Exercise.For_Loop;

import java.util.Scanner;

public class _7_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  climbersGroups = Integer.parseInt(scanner.nextLine());

        int g1 = 0, gr2 = 0, gr3 =0 , gr4 = 0, gr5 =0;
        int sumP = 0;
        for (int i = 1; i <= climbersGroups ; i++) {
            int people = Integer.parseInt(scanner.nextLine());

            if (people<= 5 ){
                g1 += people;
            }else if (people <= 12){
                gr2 += people;
            } else if (people <= 25) {
                gr3 += people;
            } else if (people <= 40) {
                gr4 += people;
            } else  {
                gr5 += people;
            }
            sumP += people;
        }

        System.out.printf("%.2f%%%n", (double) g1 /sumP  * 100);
        System.out.printf("%.2f%%%n", (double) gr2 / sumP* 100);
        System.out.printf("%.2f%%%n", (double) gr3/ sumP* 100);
        System.out.printf("%.2f%%%n",(double)  gr4 / sumP * 100);
        System.out.printf("%.2f%%%n", (double) gr5 / sumP * 100);
    }
}
