package _4_Java_OOP.Lab.ExceptionsAndErrorHandling;

import java.util.Arrays;
import java.util.Scanner;

public class NumberinRange {

    private static int start;
    private static int end;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        start = range[0];
        end = range[1];

        System.out.printf("Range: [%d...%d]\n", start, end);

        while (true){
            String input = scanner.nextLine();
            try {
                int num = Integer.parseInt(input);
                if (checks(num)){
                    System.out.println("Valid number: " + input);
                    return;
                }else {
                    System.out.println("Invalid number: " + input);
                }
            }catch (NumberFormatException ignored){
                System.out.println("Invalid number: " + input);
            }
        }


    }

    private static boolean checks(int num) {
        return num >= start && num <= end;
    }
}
