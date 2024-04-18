package _2_Java_Fundamentals._1_Lab._6_Text_Processing;
import java.util.Scanner;

public class _5_DigitsLettersandOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();


        for (int i = 0; i < text.length() ; i++) {
            char ch = text.charAt(i);
            if (Character.isDigit(ch)){
                System.out.println();

            }
        }





    }
}
