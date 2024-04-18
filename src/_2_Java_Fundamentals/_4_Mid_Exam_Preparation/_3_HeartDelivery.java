package _20_MidExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class _3_HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numers = Arrays.stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt)
                .toArray();

        while (true){
            String command = scanner.nextLine();
            if (command.equals("Love!")){
                break;
            }

        }
    }
}
