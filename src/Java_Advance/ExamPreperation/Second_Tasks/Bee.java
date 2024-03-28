package Java_Advance.ExamPreperation.Second_Tasks;

import java.util.Scanner;

public class Bee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int size = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[size][size];
        fillMatrix(matrix, scanner);

        int[] coordinates = beeCoordinates(matrix);
        int row = coordinates[0];
        int col = coordinates[1];

        int pollinatedFlower = 0;


        while (true) {
            String command = scanner.nextLine();
            if (command.equals("End")){
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

            if (outOfBounds(matrix, row, col)) {
                System.out.println("The bee got lost!");
                if (pollinatedFlower >= 5){
                    System.out.printf("Great job, the bee manage to pollinate %d flowers!%n",pollinatedFlower);
                    printMatrix(matrix);
                }else {
                    System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n",5 - pollinatedFlower);
                    printMatrix(matrix);
                }
                return;
            }

            if (matrix[row][col].equals("O")){
                matrix[row][col] =".";
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

            if (outOfBounds(matrix, row, col)) {
                System.out.println("The bee got lost!");
                if (pollinatedFlower >= 5){
                    System.out.printf("Great job, the bee manage to pollinate %d flowers!%n",pollinatedFlower);
                    printMatrix(matrix);
                }else {
                    System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n",pollinatedFlower);
                    printMatrix(matrix);
                }
                return;
            }

            if (matrix[row][col].equals("f")) {
                matrix[row][col] = ".";
                pollinatedFlower += 1;
            }
        }
        matrix[row][col] = "B";
        if (pollinatedFlower >= 5){
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n",pollinatedFlower);
            printMatrix(matrix);
        }else {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n",5 - pollinatedFlower);
            printMatrix(matrix);
        }



    }

    public static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");
        }
    }

    public static int[] beeCoordinates(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("B")) {
                    matrix[row][col] = ".";
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
