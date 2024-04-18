import java.util.Scanner;

public class _9_SkiVacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int prestoi = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String grade = scanner.nextLine();

        int nights = prestoi - 1;
        double pricePerNight = 0;

        switch (type){
            case "room for one person":
                pricePerNight = 18;
                break;
            case "apartment":
                pricePerNight = 25;
                break;
            case "president apartment":
                pricePerNight = 35;
                break;
        }

        double wholePrice = nights * pricePerNight;

        if (type.equals("apartment")){
            if (prestoi < 10){
                wholePrice = wholePrice * 0.7;
            } else if (prestoi  <= 15) {
                wholePrice = wholePrice * 0.65;
            } else {
                wholePrice = wholePrice * 0.5;
            }
        } else if (type.equals("president apartment")) {
            if (prestoi < 10){
                wholePrice = wholePrice * 0.9;
            }else if (prestoi  <= 15){
                wholePrice = wholePrice * 0.85;
            }else {
                wholePrice = wholePrice * 0.8;
            }
        }

        if (grade.equals("positive")){
            wholePrice = wholePrice + wholePrice * 0.25;
        }else {
            wholePrice = wholePrice - wholePrice * 0.1;
        }

        System.out.printf("%.2f", wholePrice);
    }
}
