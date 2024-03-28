package Java_Advance._4_ExercisesMultidimensionalArrays;

import java.util.Scanner;

public class _7_Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dims = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dims[0]);
        int cols = Integer.parseInt(dims[1]);

        int[][] matrix = new int[rows][cols];
        fillTheMatrix(matrix);
        System.out.println();


        while (true) {
            String[] com = scanner.nextLine().split("\\s+");

            int startingRow = 0;
            int startingCol = 0;
            int radius = 0;


            if (com.length == 3) {
                startingRow = Integer.parseInt(com[0]);
                startingCol = Integer.parseInt(com[1]);
                radius = Integer.parseInt(com[2]);
            } else {
                break;
            }
            int targetValue = matrix[startingRow][startingCol];
            removeElement(matrix, targetValue);


            //up

            for (int radius1 = 0; radius1 <= radius; radius1++) {
                targetValue = matrix[startingRow - 1][startingCol];
                removeElement(matrix, targetValue);
            }
            //down
            for (int radius1 = 0; radius1 <= radius; radius1++) {
                targetValue = matrix[startingRow + 1][startingCol];
                removeElement(matrix, targetValue);
            }
            //left
            for (int radius1 = 0; radius1 <= radius; radius1++) {
                targetValue = matrix[startingRow][startingCol - 1];
                removeElement(matrix, targetValue);
            }
            for (int radius1 = 0; radius1 <= radius; radius1++) {
                targetValue = matrix[startingRow][startingCol + 1];
                removeElement(matrix, targetValue);
            }
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }


    }

    public static void fillTheMatrix(int[][] matrix) {
        int gg = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = gg;
                gg += 1;
            }

        }
    }

    public static void removeElement(int[][] matrix, int targetValue) {
        boolean found = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == targetValue) {
                    found = true;
                    // Shift elements to the left to fill the gap
                    if (col < matrix[row].length - 1) {
                        // Shift elements to the left to fill the gap
                        for (int k = col; k < matrix[row].length - 1; k++) {
                            matrix[row][k] = matrix[row][k + 1];
                        }
                    }
                }
            }
            if (found) {
                break;
            }
        }
    }
}
