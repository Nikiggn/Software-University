import java.util.Scanner;

public class _10_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int even = 0;
        int odd = 0;

        for (int i = 1; i <= n ; i++) {
            int nums = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0){
                even += nums;
            }else {
                odd += nums;
            }
        }

        if (even == odd){
            System.out.printf("Yes%n");
            System.out.printf("Sum = %d", even);
        }else {
            System.out.printf("No%n");
            System.out.printf("Diff = %d", Math.abs(even -odd));
        }
    }
}
