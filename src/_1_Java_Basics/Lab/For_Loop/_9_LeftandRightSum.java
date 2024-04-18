import java.util.Scanner;

public class _9_LeftandRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumR = 0;
        int sumL = 0;
        for (int i = 1; i <= n ; i++) {
            int numR = Integer.parseInt(scanner.nextLine());

            sumR += numR;

        }

        for (int i = 0; i <n ; i++) {
            int numL = Integer.parseInt(scanner.nextLine());
            sumL += numL;
        }



        if (sumL == sumR){
            System.out.printf(" Yes, sum = %d", sumR );
        }else {
            System.out.printf(" No, diff = %d",Math.abs(sumR - sumL));
        }


    }
}
