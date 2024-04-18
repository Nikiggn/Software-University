package Lab.While_Loop;

import java.util.Scanner;

public class Sum_of_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numToReach = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (true){
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;

            if (numToReach == sum || numToReach < sum){
                System.out.println(sum);
                 break;
            }
        }
    }
}
