package Java_Advance.ExamPreperation.Second_Tasks;

import java.util.Scanner;


public class FishingCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[size][size];
        fillMatrix(matrix, scanner);

        int[] coordinates = shipCoordinates(matrix);
        int row = coordinates[0];
        int col = coordinates[1];

        int tonsOfFish = 0;

        String command = scanner.nextLine();
        while (!"collect the nets".equals(command)) {

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

            if (col == size) {
                col = 0;
            } else if (col < 0) {
                col = size - 1;
            }

            if (row == size) {
                row = 0;
            } else if (row < 0) {
                row = size - 1;
            }

            if (matrix[row][col].equals("W")) {
                System.out.printf
                        ("You fell into a whirlpool! The ship sank and you lost the fish you caught. Last coordinates of the ship: [%d,%d]%n", row, col);
                return;
            }

            if (!matrix[row][col].equals("-")) {
                tonsOfFish += Integer.parseInt(matrix[row][col]);
                matrix[row][col] = "-";
            }

            command = scanner.nextLine();
        }

        matrix[row][col] = "S";
        if (tonsOfFish >= 20) {
            System.out.println("Success! You managed to reach the quota!");
        } else {
            System.out.printf("You didn't catch enough fish and didn't reach the quota! You need %d tons of fish more.%n", 20 - tonsOfFish);
        }

        if (tonsOfFish > 0) {
            System.out.printf("Amount of fish caught: %d tons.%n", tonsOfFish);
        }

        printMatrix(matrix);

    }

    public static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");
        }
    }

    public static int[] shipCoordinates(String[][] matrix) {
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

    private static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String dot : row) {
                System.out.print(dot);
            }
            System.out.println();
        }
    }
}
