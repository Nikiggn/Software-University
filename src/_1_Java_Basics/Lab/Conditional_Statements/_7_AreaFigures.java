import java.util.Scanner;

public class _7_AreaFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        if (figure.equals("square")){
            double strana = Double.parseDouble(scanner.nextLine());
            double lice = strana * strana;
            System.out.printf("%.3f", lice);
        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", a * b);
        }else if (figure.equals("circle")){
            double r = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", r * r * Math.PI);
        }else if (figure.equals("triangle")){
            double c = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",(c * h) / 2 );
        }

    }
}
