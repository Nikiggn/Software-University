import java.util.Scanner;

public class _8_PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogs = Integer.parseInt(scanner.nextLine());
        int cats = Integer.parseInt(scanner.nextLine());

        double priceDogs = dogs * 2.50;
        double priceCats = cats * 4.0;

        double sum = priceCats + priceDogs;

        System.out.println(sum +  " lv.");


    }
}
