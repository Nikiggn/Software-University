package _3_Java_Advance._3_ExamPreperation._2_Multidimensional_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NavyBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[size][size];
        fillMatrix(matrix, scanner);

        int[] coordinates = shipCoordinates(matrix);
        int row = coordinates[0];
        int col = coordinates[1];

        int hitMines = 0;
        List<String> cruises = cruises(matrix);

        while (hitMines != 3 && !cruises.isEmpty()) {
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

            if (matrix[row][col].equals("*")) {
                matrix[row][col] = "-";
                hitMines++;
            }

            if (matrix[row][col].equals("C")) {
                matrix[row][col] = "-";
                cruises.remove("C");
            }
        }

        if (cruises.isEmpty()) {
            System.out.println("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!");
            matrix[row][col] = "S";
            printMatrix(matrix);
        } else {
            System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!%n", row, col);
            matrix[row][col] = "S";
            printMatrix(matrix);
        }


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

    public static List<String> cruises(String[][] matrix) {
        List<String> cruises = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("C")) {
                    cruises.add(matrix[row][col]);
                }
            }
        }
        return cruises;
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
