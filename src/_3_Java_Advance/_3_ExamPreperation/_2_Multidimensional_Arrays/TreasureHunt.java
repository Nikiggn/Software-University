package _3_Java_Advance._3_ExamPreperation._2_Multidimensional_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[0]);

        String[][] matrix = new String[rows][cols];
        fillMatrix(matrix,scanner);

        int[] coordinates = hunterCoordinates(matrix);
        int row= coordinates[0];
        int col = coordinates[1];

        List<String> rightPath = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("Finish")){

            int curRow = row;
            int curCol = col;
            rightPath.add(command);

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

            if (row < 0 || row == matrix.length || col < 0 || col == matrix.length) {
                row = curRow;
                col = curCol;
                rightPath.remove(command);
            }

            if (matrix[row][col].equals("T")){
                row = curRow;
                col = curCol;
                rightPath.remove(command);
            }
            command = scanner.nextLine();
        }


        if (matrix[row][col].equals("X")){
            String res = String.join(", ", rightPath);
            System.out.println("I've found the treasure!");
            System.out.printf("The right path is %s", res);
        }else {
            System.out.println("The map is fake!");
        }

    }

    public static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split(" ");
        }
    }

    public static int[] hunterCoordinates(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("Y")) {
                    matrix[row][col] = "-";
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }
}
