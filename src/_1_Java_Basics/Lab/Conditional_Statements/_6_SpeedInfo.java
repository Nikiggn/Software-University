import java.util.Scanner;

public class _6_SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double a = Double.parseDouble(scanner.nextLine());

        if (a <= 10){
            System.out.println("slow");
        } else if (a > 10 & a <= 50 ) {
            System.out.println("average" );
        } else if (a > 50 & a <= 150) {
            System.out.println("fast");
        } else if (a > 150 & a <= 1000) {
            System.out.println("ultra fast" );
        }else {
            System.out.println("extremely fast");
        }


    }
}
