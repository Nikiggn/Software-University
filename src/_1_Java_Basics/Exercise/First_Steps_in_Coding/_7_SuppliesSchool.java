import java.util.Scanner;

public class _7_SuppliesSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegensMenu = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chickenMenu * 10.35;
        double fishPrice = fishMenu * 12.40;
        double vegensPrice = vegensMenu * 8.15;

        double sumPrice = chickenPrice + fishPrice + vegensPrice;

        double desert = sumPrice * 0.2;
        double dostafka = 2.50;

        double AllSum = sumPrice + desert + dostafka;

        System.out.println(AllSum);


    }
}
