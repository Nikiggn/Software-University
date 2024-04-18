import java.util.Scanner;

public class _3_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int srok = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double ratemonth = deposit * (percent / 100) / 12;
        double sum = deposit + (srok * ratemonth);
        System.out.println(sum);



    }
}
