package Java_Advance.ExamPreperation.Second_Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheSquirrel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        List<String> commands = Arrays.stream(scanner.nextLine()
                        .split(", "))
                .collect(Collectors.toList());

        String[][] matrix = new String[size][size];
        fillMatrix(matrix, scanner);

        int[] coordinates = squirrelCoordinates(matrix);
        int row = coordinates[0];
        int col = coordinates[1];

        int collectedHazelnuts = 0;

        while (collectedHazelnuts != 3 && commands.size() != 0) {
            String command = commands.get(0);
            commands.remove(command);

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
                System.out.println("The squirrel is out of the field.");
                System.out.printf("Hazelnuts collected: %d%n", collectedHazelnuts);
                return;
            }

            if (matrix[row][col].equals("t")) {
                System.out.println("Unfortunately, the squirrel stepped on a trap...");
                System.out.printf("Hazelnuts collected: %d%n", collectedHazelnuts);
                return;
            }
            if (matrix[row][col].equals("h")) {
                matrix[row][col] = "*";
                collectedHazelnuts++;
            }
        }

        if (collectedHazelnuts == 3) {
            System.out.println("Good job! You have collected all hazelnuts!");
            System.out.println("Hazelnuts collected: 3");
        } else {
            System.out.println("There are more hazelnuts to collect.");
            System.out.printf("Hazelnuts collected: %d%n", collectedHazelnuts);
        }
    }

    public static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");
        }
    }

    public static int[] squirrelCoordinates(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("s")) {
                    matrix[row][col] = "*";
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
