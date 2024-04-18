package _3_Java_Advance._3_ExamPreperation._2_Multidimensional_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlindMansBuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[0]);

        String[][] matrix = new String[rows][cols];
        fillMatrix(matrix, scanner);

        int[] coordinates = blindManCoordinates(matrix);
        int row = coordinates[0];
        int col = coordinates[1];

        int touchedOpponents = 0;
        int moves = 0;
        List<String> players = players(matrix);

        String command = scanner.nextLine();
        while (!command.equals("Finish")) {

            moves++;

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


            if (row < 0 || row == rows || col < 0 || col == cols) {
                row = curRow;
                col = curCol;
                moves--;
            }
            if (matrix[row][col].equals("O")) {
                row = curRow;
                col = curCol;
                moves--;
            }

            if (matrix[row][col].equals("P")) {
                matrix[row][col] = "B";
                touchedOpponents++;
                players.remove("P");
                if (players.isEmpty()) {
                    System.out.println("Game over!");
                    System.out.printf("Touched opponents: %d Moves made: %d%n", touchedOpponents, moves);
                    return;
                }
            }
            command = scanner.nextLine();
        }
        System.out.println("Game over!");
        System.out.printf("Touched opponents: %d Moves made: %d%n", touchedOpponents, moves);


    }

    public static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split(" ");
        }
    }


    public static int[] blindManCoordinates(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("B")) {
                    matrix[row][col] = "-";
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }

    public static List<String> players(String[][] matrix) {
        List<String> players = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("P")) {
                    players.add(matrix[row][col]);
                }
            }
        }
        return players;
    }


}
