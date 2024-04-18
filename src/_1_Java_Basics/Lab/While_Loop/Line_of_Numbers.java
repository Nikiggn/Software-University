package Lab.While_Loop;

import java.util.Scanner;

public class Line_of_Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int startingNum = 1;

       while (startingNum <= a){
           System.out.println(startingNum);
           startingNum = startingNum * 2 + 1;
       }
    }
}
