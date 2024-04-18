package Lab.While_Loop;

import java.util.Scanner;

public class Reading_words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        while (!"Stop".equals(command)){
            System.out.println(command);
            command = scanner.nextLine();
        }

    }
}
