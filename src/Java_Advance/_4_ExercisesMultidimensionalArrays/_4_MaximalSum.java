package Java_Advance._4_ExercisesMultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _4_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine()
                            .split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
        int[][] resMatrix = new int[3][3];

        int sum = Integer.MIN_VALUE;

        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int curVal = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +
                        matrix[row + 1][col] + matrix[row + 1][col +1] + matrix[row + 1][col + 2] +
                        matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col+ 2];

                if (curVal > sum){
                    sum = curVal;
                    resMatrix[0][0] = matrix[row][col];
                    resMatrix[0][1] = matrix[row][col + 1];
                    resMatrix[0][2] = matrix[row][col + 2];
                    resMatrix[1][0] = matrix[row + 1][col];
                    resMatrix[1][1] = matrix[row + 1][col +1];
                    resMatrix[1][2] = matrix[row + 1][col + 2];
                    resMatrix[2][0] = matrix[row + 2][col];
                    resMatrix[2][1] =matrix[row + 2][col + 1];
                    resMatrix[2][2] = matrix[row + 2][col+ 2];


                }
            }
        }

        System.out.println("Sum = " + sum);
        for (int[] row:resMatrix) {
            for (int num: row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


}
