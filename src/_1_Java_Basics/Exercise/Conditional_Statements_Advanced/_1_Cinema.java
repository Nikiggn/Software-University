import java.util.Scanner;

public class _1_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int chairs = rows * columns;
        double money = 0;

        switch (type){
            case "Premiere":
                money = 12.00;

                break;
            case "Normal":
                money = 7.5;
                break;
            case "Discount":
                money = 5;
                break;
        }
        double profit = chairs * money;
        System.out.printf("%.2f leva", profit);
    }
}
