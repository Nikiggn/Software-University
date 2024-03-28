package Java_Advance.ExamPreperation.Second_Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MouseInTheKitchen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] dims = scanner.nextLine().split(",");
        int rows = Integer.parseInt(dims[0]);
        int cols = Integer.parseInt((dims[1]));
        String[][] matrix = new String[rows][cols];
        fillMatrix(matrix, scanner);

        int[] coordinates = mouseCoordinates(matrix);
        int startingRow = coordinates[0];
        int startingCol = coordinates[1];

        List<String> allTheCheese = cheese(matrix);


        String command = scanner.nextLine();
        while (!command.equals("danger")) {
            int[] currentCoordinates = {startingRow, startingCol};

            switch (command) {
                case "left":
                    startingCol -= 1;
                    break;
                case "right":
                    startingCol += 1;
                    break;
                case "up":
                    startingRow -= 1;
                    break;
                case "down":
                    startingRow += 1;
                    break;
            }


            if (startingCol < 0 || startingCol >= matrix[0].length || startingRow < 0 || startingRow >= matrix.length) {
                matrix[currentCoordinates[0]][currentCoordinates[1]] = "M";
                System.out.println("No more cheese for tonight!");
                printMatrix(matrix);
                return;
            }
            if (matrix[startingRow][startingCol].equals("@")) {
                startingRow = currentCoordinates[0];
                startingCol = currentCoordinates[1];
            }

            if (matrix[startingRow][startingCol].equals("C")) {
                matrix[startingRow][startingCol] = "*";
                allTheCheese.remove("C");
                if (allTheCheese.isEmpty()) {
                    System.out.println("Happy mouse! All the cheese is eaten, good night!");
                    matrix[startingRow][startingCol] = "M";
                    printMatrix(matrix);
                    return;
                }

            }

            if (matrix[startingRow][startingCol].equals("T")) {
                matrix[startingRow][startingCol] = "M";
                System.out.println("Mouse is trapped!");
                printMatrix(matrix);
                return;
            }

            command = scanner.nextLine();
        }

        if (!allTheCheese.isEmpty()) {
            System.out.println("Mouse will come back later!");
            matrix[startingRow][startingCol] = "M";
            printMatrix(matrix);
        }


    }

    public static int[] mouseCoordinates(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col].equals("M")) {
                    matrix[row][col] = "*";
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }

    public static List<String> cheese(String[][] matrix) {
        List<String> cheeseNum = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col].equals("C")) {
                    cheeseNum.add("C");
                }
            }
        }
        return cheeseNum;
    }

    public static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");
        }
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
