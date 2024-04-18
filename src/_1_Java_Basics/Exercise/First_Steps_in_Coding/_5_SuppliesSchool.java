import java.util.Scanner;
public class _5_SuppliesSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //•	Пакет химикали - 5.80 лв.
        //•	Пакет маркери - 7.20 лв.
        //•	Препарат - 1.20 лв (за литър)

        int pencils = Integer.parseInt(scanner.nextLine());
        int markers =Integer.parseInt(scanner.nextLine());
        int litres = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double Sumpencils = pencils * 5.80;
        double Summarkers = markers * 7.20;
        double Sumlitres = litres * 1.20;

        double sum = Sumlitres + Summarkers + Sumpencils ;
        double result= sum -( sum * percent / 100);

        System.out.println(result);


        //Изход
        //Да се отпечата на конзолата колко пари ще са нужни на Ани, за да си плати сметката.


    }
}
