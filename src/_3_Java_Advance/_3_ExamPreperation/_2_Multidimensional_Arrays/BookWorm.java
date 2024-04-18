package _3_Java_Advance._3_ExamPreperation._2_Multidimensional_Arrays;

import java.util.Scanner;

public class BookWorm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder name = new StringBuilder(scanner.nextLine());

        int size = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[size][size];
        fillMatrix(matrix, scanner);

        int[] coordinates = wormCoordinates(matrix);
        int row = coordinates[0];
        int col = coordinates[1];

        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            int curRow = row;
            int curCol = col;

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
                if (name.length() > 0){
                    name = new StringBuilder(name.substring(0, name.length() - 1));
                }
            }

            String symbol = matrix[row][col];
            if (!symbol.equals("-")) {
                name.append(symbol);
                matrix[row][col] = "-";
            }
            command = scanner.nextLine();
        }
        matrix[row][col] = "P";
        System.out.println(name);
        printMatrix(matrix);
    }

    public static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");
        }
    }

    public static int[] wormCoordinates(String[][] matrix) {
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

    private static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String dot : row) {
                System.out.print(dot);
            }
            System.out.println();
        }
    }
}
