package _3_Java_Advance._3_ExamPreperation._2_Multidimensional_Arrays;

import java.util.Scanner;

public class Snake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[size][size];
        fillTheMatrix(matrix, scanner);

        int[] coordinates = ourCoordinates(matrix);
        int startingRow = coordinates[0];
        int startingCol = coordinates[1];


        int foodQuantity = 0;

        while (true) {
            String commands = scanner.nextLine();
            matrix[startingRow][startingCol] = ".";

            switch (commands) {
                case "up":
                    startingRow -= 1;
                    break;
                case "down":
                    startingRow += 1;
                    break;
                case "left":
                    startingCol -= 1;
                    break;
                case "right":
                    startingCol += 1;
                    break;
            }
            if (startingRow < 0 || startingRow >= matrix.length || startingCol < 0 || startingCol >= matrix.length) {
                System.out.println("Game over!");
                System.out.printf("Food eaten: %d%n", foodQuantity);
                for (String[] row : matrix) {
                    for (String dot : row) {
                        System.out.print(dot);
                    }
                    System.out.println();
                }
                return;
            } else if (matrix[startingRow][startingCol].equals("*")) {
                foodQuantity += 1;
                if (foodQuantity == 10) {
                    System.out.println("You won! You fed the snake.");
                    System.out.printf("Food eaten: %d%n", foodQuantity);
                    matrix[startingRow][startingCol] = "S";
                    for (String[] row : matrix) {
                        for (String dot : row) {
                            System.out.print(dot);
                        }
                        System.out.println();
                    }

                    return;
                }
            } else if (matrix[startingRow][startingCol].equals("B")) {
                matrix[startingRow][startingCol] = "." ;
                int[] newVal = Bcoordinates(matrix);
                startingRow = newVal[0];
                startingCol = newVal[1];
                matrix[startingRow][startingCol] = ".";
            }
        }
    }

    public static int[] Bcoordinates(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("B")) {
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }

    public static int[] ourCoordinates(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("S")) {
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }

    public static void fillTheMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");
        }
    }
}
