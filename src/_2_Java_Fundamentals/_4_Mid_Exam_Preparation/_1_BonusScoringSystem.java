package _20_MidExamPreparation;
import java.util.Scanner;

public class _1_BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double students = Double.parseDouble(scanner.nextLine());
        double lectures = Double.parseDouble(scanner.nextLine());
        double additionalBonus = Double.parseDouble(scanner.nextLine());

        double max = 0;
        double maxL = 0;

        double[] numbers = new double[(int) students];
        for (int i = 0; i < students; i++) {
            double attendance = Integer.parseInt(scanner.nextLine());
            double bonus = (attendance / lectures) * (5 + additionalBonus);
            numbers[i] = bonus;


            if (attendance > maxL) {
                maxL = attendance;
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(max));
        System.out.printf("The student has attended %.0f lectures.", Math.abs(maxL));
    }
}
