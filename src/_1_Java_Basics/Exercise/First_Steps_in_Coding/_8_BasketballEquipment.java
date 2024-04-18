import java.util.Scanner;

public class _8_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int YearTax = Integer.parseInt(scanner.nextLine());

        double kets = YearTax - YearTax * 0.4;
        double ekip = kets - kets * 0.2;
        double ball = ekip * 0.25;
        double aks = ball * 0.2;

        double sum = YearTax + kets + ekip + ball + aks;

        System.out.println(sum);



    }
}
