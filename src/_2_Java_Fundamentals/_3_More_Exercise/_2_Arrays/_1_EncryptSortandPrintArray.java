package _2_Java_Fundamentals._3_More_Exercise._2_Arrays;
import java.util.Scanner;

public class _1_EncryptSortandPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[] values = new int[rows];
        int sumChars = 0;

        for (int i = 0; i < rows ; i++) {
            String name = scanner.nextLine();
            for (int j = 0; j < name.length() ; j++) {
                char curChar = name.charAt(j);
                int currentChar = curChar;
                int all = 0;

               if (curChar == 'a' || curChar == 'e' || curChar == 'i' || curChar == 'y' || curChar == 'o' || curChar == 'u'){
                   currentChar = currentChar * name.length();
               }else {
                   currentChar = currentChar / name.length();
               }
               //sumChars += currentChar;
                all += currentChar;
                values[i] +=  all;
            }
        }

        for (int el1: values) {
            System.out.println(el1);
        }


    }
}
