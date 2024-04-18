import java.util.Scanner;
public class _5_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget  = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;
        String destination = "";
        String typeHoliday = "";


        if (budget <= 100){
            if (season.equals("summer")){
                price = budget * 0.3;
                destination = "Bulgaria";
                typeHoliday = "Camp";
            }else if (season.equals("winter")){
                price = budget * 0.7;
                destination = "Bulgaria";
                typeHoliday = "Hotel";
            }
        } else if (budget <= 1000) {
            if (season.equals("summer")){
                price = budget * 0.4;
                destination = "Balkans";
                typeHoliday = "Camp";
            }else if (season.equals("winter")){
                price = budget * 0.8;
                destination = "Balkans";
                typeHoliday = "Hotel";
            }
        }else {
            price = budget * 0.9;
            destination = "Europe";
            typeHoliday = "Hotel";
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", typeHoliday, price);
    }
}
