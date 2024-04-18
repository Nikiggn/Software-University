package Lab.While_Loop;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String password  = scanner.nextLine();



        while (true){
            String newTry = scanner.nextLine();
            if (newTry.equals(password)){
                System.out.printf("Welcome %s", name);
                break;
            }
        }
    }
}
