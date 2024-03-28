package Java_Advance._3_LabMultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _5_MaximumSumof2X2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(parts[0]);
        int cols = Integer.parseInt(parts[0]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int sum = Integer.MIN_VALUE;

        int[][] resultMatrix = new int[2][2];


        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {

                int curSum =
                        matrix[row][col] +
                        matrix[row][col + 1] +
                        matrix[row + 1][col] +
                        matrix[row + 1][col + 1];
                if (curSum> sum){
                    sum = curSum;
                    resultMatrix[0][0] = matrix[row][col];
                    resultMatrix[0][1] = matrix[row][col + 1];
                    resultMatrix[1][0] = matrix[row + 1][col];
                    resultMatrix[1][1] = matrix[row + 1][col + 1];
                }
            }
        }

        printRes(resultMatrix);
        System.out.println(sum);

    }

    public  static  void printRes(int[][] arr){
        for (int row = 0; row < arr.length ; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < arr[row].length; col++) {
                sb.append(arr[row][col]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }

    }
}
