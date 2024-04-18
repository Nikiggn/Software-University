package _2_Java_Fundamentals._1_Lab._6_Text_Processing;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class _1_ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String res = "";
        LinkedHashMap<String, String> answer = new LinkedHashMap<>();
        while (true){
            String line = scanner.nextLine();
            if (line.equals("end")){
                break;
            }
            for (int i = line.length() -1; i >= 0 ; i--) {
                char last = line.charAt(i);
                res = res.concat(String.valueOf(last));
                answer.put(line, res);
            }
        }
        answer.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
