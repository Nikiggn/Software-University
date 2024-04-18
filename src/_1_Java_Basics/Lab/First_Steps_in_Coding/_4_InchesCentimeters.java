import java.util.Scanner;

public class _4_InchesCentimeters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double inches =  Double.parseDouble(scanner.nextLine());
        double cm = 2.54 * inches;
        System.out.println(cm);


    }
}
