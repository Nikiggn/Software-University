package Java_Advance.ExamPreperation.Second_Tasks;

import java.util.Scanner;

public class Armory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[size][size];
        fillMatrix(matrix, scanner);

        int[] coordinates = armyOfficerCoordinates(matrix);
        int row = coordinates[0];
        int col = coordinates[1];

        int coins = 0;

        while (true) {
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

            if (outOfBounds(matrix, row, col)) {
                System.out.println("I do not need more swords!");
                System.out.printf("The king paid %d gold coins.%n", coins);
                printMatrix(matrix);
                return;

            }
            if (!matrix[row][col].equals("M") && !matrix[row][col].equals("-")) {
                coins += Integer.parseInt(matrix[row][col]);
                matrix[row][col] = "-";

                if (coins >= 65) {
                    matrix[row][col] = "A";
                    System.out.println("Very nice swords, I will come back for more!");
                    System.out.printf("The king paid %d gold coins.%n", coins);
                    printMatrix(matrix);
                    return;
                }
            }

            if (matrix[row][col].equals("M")) {
                matrix[row][col] = "-";
                int[] mirrorCoordinates = secondMirrorCoordinates(matrix);
                row = mirrorCoordinates[0];
                col = mirrorCoordinates[1];

            }
            ;
        }


    }

    public static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");
        }
    }

    public static int[] armyOfficerCoordinates(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("A")) {
                    matrix[row][col] = "-";
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }

    public static int[] secondMirrorCoordinates(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("M")) {
                    matrix[row][col] = "-";
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }

    public static boolean outOfBounds(String[][] matrix, int row, int col) {
        return row < 0 || row == matrix.length || col < 0 || col == matrix.length;
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
