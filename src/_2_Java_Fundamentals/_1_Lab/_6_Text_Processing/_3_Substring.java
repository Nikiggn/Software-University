package _2_Java_Fundamentals._1_Lab._6_Text_Processing;

import java.util.Scanner;

public class _3_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String text = scanner.nextLine();
        while (true){
            int ind = text.indexOf(word);
            if (ind == -1){
                break;
            }
            String left = text.substring(0, ind);
            String right = text.substring(ind + word.length());

            text = left + right;
        }
        System.out.println(text);
    }
}
