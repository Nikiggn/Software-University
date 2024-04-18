import java.util.Scanner;

public class _7_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mounth = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0;
        double apartPrice = 0;

        switch (mounth){
            case "May":
                 studioPrice = 50;
                 apartPrice = 65;
                break;
            case "October":
                studioPrice = 50;
                apartPrice = 65;
                break;

            case "June":
                 studioPrice = 75.2;
                 apartPrice = 68.70;
                break;
            case "September":
                studioPrice = 75.2;
                apartPrice = 68.70;
                break;
            case "July":
                 studioPrice = 76;
                 apartPrice = 77;
                break;
            case "August":
                studioPrice = 76;
                apartPrice = 77;
                break;

        }

        //double price = nights * (studioPrice + apartPrice);

        if (nights > 14 && mounth.equals("May") || mounth.equals("October")){
            studioPrice = studioPrice - studioPrice * 0.3;
        } else if (nights > 7 && mounth.equals("May") || mounth.equals("October")) {
            studioPrice = studioPrice - studioPrice * 0.05;
        } else if (nights > 14 && mounth.equals("June") || mounth.equals("September")) {
            studioPrice = studioPrice - studioPrice * 0.2;
        }
        if (nights > 14){
            apartPrice = apartPrice - apartPrice * 0.1;
        }


        double wholePriceApart = nights * apartPrice;
        double wholePriceStudio = nights * studioPrice;
        System.out.printf("Apartment: %.2f lv.%n", wholePriceApart);
        System.out.printf("Studio: %.2f lv.", wholePriceStudio);
    }
}
