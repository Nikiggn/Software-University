package _3_Java_Advance._3_ExamPreperation._2_Multidimensional_Arrays;

import java.util.Scanner;

public class CookingJourney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size  = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[size][size];
        fillMatrix(matrix,scanner);

        int[] coordinates = chefCoordinates(matrix);
        int row = coordinates[0];
        int col = coordinates[1];

        int money = 0;

        while (true){
            String command = scanner.nextLine();

            switch (command) {
                case "left":
                    col -= 1;
                    break;
                case "right":
                    col += 1;
                    break;
                case "up":
                    row -= 1;
                    break;
                case "down":
                    row += 1;
                    break;
            }

            if (outOfBounds(matrix, row, col)){
                System.out.println("Bad news! You are out of the pastry shop.");
                printMatrix(matrix,money);
                return;
            }

            if (matrix[row][col].equals("P")) {
                matrix[row][col] = "-";
                int[] newCoordinates  =secondPillarCoordinates(matrix);
                row = newCoordinates[0];
                col = newCoordinates[1];
            }

            if (isMoney(matrix,row,col)){
                money += Integer.parseInt(matrix[row][col]);
                matrix[row][col] = "-";

                if (money >= 50){
                    matrix[row][col] = "S";
                    System.out.println("Good news! You succeeded in collecting enough money!");
                    printMatrix(matrix,money);
                    return;
                }
            }

        }

    }

    public static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");
        }
    }

    public static int[] chefCoordinates(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("S")) {
                    matrix[row][col] = "-";
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }

    public static int[] secondPillarCoordinates(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("P")) {
                    matrix[row][col] = "-";
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }

    public static boolean outOfBounds(String[][] matrix, int row, int col) {
        if (row < 0 || row == matrix.length || col < 0 || col == matrix.length) {
            return true;
        }
        return false;
    }

    private static void printMatrix(String[][] matrix, int money) {
        System.out.printf("Money: %d%n", money);
        for (String[] row : matrix) {
            for (String dot : row) {
                System.out.print(dot);
            }
            System.out.println();
        }
    }

    public static boolean isMoney(String[][] matrix, int row, int col){
        return !matrix[row][col].equals("P") && !matrix[row][col].equals("-");
    }
}
