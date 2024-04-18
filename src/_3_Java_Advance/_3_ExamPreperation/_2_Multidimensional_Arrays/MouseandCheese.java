package _3_Java_Advance._3_ExamPreperation._2_Multidimensional_Arrays;

import java.util.Scanner;

public class MouseandCheese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[size][size];
        fillMatrix(matrix,scanner);

        int[] coordinates = mouseCoordinates(matrix);
        int row = coordinates[0];
        int col = coordinates[1];

        int cheese = 0;

        while (true){
            String command = scanner.nextLine();

            if (command.equals("end")){
                break;
            }

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
            if (outOfBounds(matrix, row, col)){
                System.out.println("Where is the mouse?");
                break;

            }

            if (matrix[row][col].equals("c")){
                matrix[row][col] = "-";
                cheese += 1;
            }

            if (matrix[row][col].equals("B")) {
                matrix[row][col] = "-";
                if (!outOfBounds(matrix, row, col)) {
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
                }
            }


            if (outOfBounds(matrix, row, col)){
                System.out.println("Where is the mouse?");
                break;

            }

        }
        if (!outOfBounds(matrix, row, col)){
           matrix[row][col] = "M";

        }

        if(cheese>= 5){
            System.out.printf("Great job, the mouse is fed %s cheeses!%n",cheese);
            printMatrix(matrix);
        }else {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n",5 - cheese);
            printMatrix(matrix);
        }
    }
    public static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");
        }
    }

    public static int[] mouseCoordinates(String[][] matrix) {
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
        if (row < 0 || row == matrix.length || col < 0 || col == matrix.length) {
            return true;
        }
        return false;
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
