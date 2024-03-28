package Java_Advance._4_ExercisesMultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _3_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dim = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[dim][dim];

        for (int row = 0; row < dim; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int firstSum = findFirstSum(matrix);
        int secondSum = findSecondSum(matrix);

        System.out.println(Math.abs(firstSum - secondSum));


    }

    private static int findSecondSum(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix.length - row - 1 == col) {
                    sum += matrix[row][col];
                }
            }
        }
        return sum;
    }

    private static int findFirstSum(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (row == col) {
                    sum += matrix[row][col];
                }
            }
        }
        return sum;
    }
}
