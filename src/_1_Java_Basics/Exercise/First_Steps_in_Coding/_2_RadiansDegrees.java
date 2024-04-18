import java.util.Scanner;

public class _2_RadiansDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radiant = Double.parseDouble(scanner.nextLine());
        double radius = radiant * (180/Math.PI);

        System.out.println(radius);

    }
}
