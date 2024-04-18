package _3_Java_Advance._3_ExamPreperation._2_Multidimensional_Arrays;

import java.util.Scanner;

public class FormulaOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int size = Integer.parseInt(scanner.nextLine());
        int countCommands =Integer.parseInt(scanner.nextLine());

        String[][] matrix =new String[size][size];
        fillTheMatrix(matrix, scanner);
        int [] coordinates = ourCoordinates(matrix);
        int startingRow = coordinates[0];
        int startingCol = coordinates[1];
        matrix[startingRow][startingCol] = ".";

        for (int i = 0; i < countCommands; i++) {
            String command = scanner.nextLine();


            switch (command) {
                case "left":
                    moveLeft(matrix, startingRow, startingCol, size);
                    break;
                case "right":
                    moveRight(matrix, startingRow, startingCol, size);
                    break;
                case "up":
                    moveUp(matrix, startingRow, startingCol, size);
                    break;
                case "down":
                    moveDown(matrix, startingRow, startingCol, size);
                    break;
            }

            if (matrix[startingRow][startingCol].equals("F")){
                matrix[startingRow][startingCol] = "P";
                System.out.println("Well done, the player won first place!");
                printMatrix(matrix);
                return;
            }
        }

        matrix[startingRow][startingCol] = "P";
        System.out.println("Oh no, the player got lost on the track!");
        printMatrix(matrix);


    }

    public static void fillTheMatrix(String[][] matrix, Scanner scanner){
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");
        }
    }

    public static int[] ourCoordinates(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("P")) {
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String dot : row) {
                System.out.print(dot);
            }
            System.out.println();
        }
    }

    public  static  boolean isBoost (String[][] matrix, int row, int col){
        if (matrix[row][col].equals("B")){
            return true;
        }
        return false;
    }

    public  static  boolean isTrap(String[][] matrix, int row, int col){
        if (matrix[row][col].equals("T")){
            return true;
        }
        return false;
    }

    private static void moveLeft(String[][] matrix, int row, int col, int size) {
        col = adjustPosition(col - 1, size);
        if (isBoost(matrix, row, col)) {
            col = adjustPosition(col - 1, size);
        } else if (isTrap(matrix, row, col)) {
            col = adjustPosition(col + 1, size);
        }
    }

    private static int adjustPosition(int position, int size) {
        if (position < 0) {
            return size - 1;
        } else if (position == size) {
            return 0;
        }
        return position;
    }
    private static void moveRight(String[][] matrix, int row, int col, int size) {
        col = adjustPosition(col + 1, size);
        if (isBoost(matrix, row, col)) {
            col = adjustPosition(col + 1, size);
        } else if (isTrap(matrix, row, col)) {
            col = adjustPosition(col - 1, size);
        }
    }

    private static void moveUp(String[][] matrix, int row, int col, int size) {
        row = adjustPosition(row - 1, size);
        if (isBoost(matrix, row, col)) {
            row = adjustPosition(row - 1, size);
        } else if (isTrap(matrix, row, col)) {
            row = adjustPosition(row + 1, size);
        }
    }

    private static void moveDown(String[][] matrix, int row, int col, int size) {
        row = adjustPosition(row + 1, size);
        if (isBoost(matrix, row, col)) {
            row = adjustPosition(row + 1, size);
        } else if (isTrap(matrix, row, col)) {
            row = adjustPosition(row - 1, size);
        }
    }


}
