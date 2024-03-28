package Java_Advance.ExamPreperation.Second_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int size = Integer.parseInt(scanner.nextLine());
        List<String> commands = Arrays.stream(scanner.nextLine().split(","))
                .collect(Collectors.toList());
        String[][] matrix = new String[size][size];
        fillMatrix(matrix, scanner);

        List<String> bombsOnMap = bombsList(matrix);

        int[] coordinates = sapperCoordinates(matrix);
        int row = coordinates[0];
        int col = coordinates[1];


        int deactBoms = 0;


        for (int i = 0; i < commands.size(); i++) {
            String command = commands.get(i);

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

            if (outOfBounds(matrix, row, col)) {
                row = curRow;
                col = curCol;
            }

            if (matrix[row][col].equals("e")) {
                System.out.printf("END! %d bombs left on the field", bombsOnMap.size());
                return;
            }

            if (matrix[row][col].equals("B")) {
                matrix[row][col] = "+";
                deactBoms++;
                System.out.println("You found a bomb!");
                bombsOnMap.remove("B");

                if (bombsOnMap.isEmpty()) {
                    System.out.println("Congratulations! You found all bombs!");
                    return;
                }

            }
        }

        System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", bombsOnMap.size());

    }

    public static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split(" ");
        }
    }

    public static int[] sapperCoordinates(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("s")) {
                    matrix[row][col] = "+";
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }

    public static List<String> bombsList(String[][] matrix) {
        List<String> bombs = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col].equals("B")) {
                    bombs.add("B");
                }
            }
        }
        return bombs;
    }

    public static boolean outOfBounds(String[][] matrix, int row, int col) {
        if (row < 0 || row == matrix.length || col < 0 || col == matrix.length) {
            return true;
        }
        return false;
    }
}
