import java.util.Scanner;

public class _8_NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int maxNum = 0;
        int minNum = 0;
        for (int i = 1; i <= num ; i++) {
            int surnum = Integer.parseInt(scanner.nextLine());

            if (surnum > maxNum){
                maxNum = surnum;
            }

            if (surnum < minNum){
                minNum = surnum;
            }
        }
        System.out.println("Max number: " + maxNum);
        System.out.println("Min number: " + minNum);
    }
}
