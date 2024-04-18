package _14_Methods.b;

import java.util.Scanner;

public class _9_GreaterofTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values = scanner.nextLine();

        if (values.contains("int")) {
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());

            int result = getMaxInt(a, b);
            System.out.println(result);
        } else if (values.contains("char")) {
            char a = scanner.nextLine().charAt(0);
            char b = scanner.nextLine().charAt(0);

            char result = getMaxChar(a, b);
            System.out.println(result);
        }else {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            
            String result = getMaxString(a,b);
            System.out.println(result);
        }

    }

    public static int getMaxInt(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static char getMaxChar(char a, char b) {
        if (a > b){
            return a;
        }
        return b;
    }

    public static String getMaxString(String a, String b) {
        if (a.compareTo(b) >= 0){
            return a;
        }
        return b;
    }
}
