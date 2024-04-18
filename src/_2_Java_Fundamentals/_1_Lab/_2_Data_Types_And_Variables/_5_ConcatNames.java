package _2_Java_Fundamentals._1_Lab._2_Data_Types_And_Variables;

import java.util.Scanner;

public class _5_ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        char delimeter = (char) Integer.parseInt(scanner.nextLine());

        System.out.println(delimeter);
    }
}
