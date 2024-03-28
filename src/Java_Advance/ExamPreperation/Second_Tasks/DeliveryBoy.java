package Java_Advance.ExamPreperation.Second_Tasks;

import java.util.Scanner;

public class DeliveryBoy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dim = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dim[0]);
        int cols = Integer.parseInt(dim[1]);

        String[][] matrix = new String[rows][cols];
        fillMatrix(matrix,scanner);

        int[] coordinates = deliveryBoyCoordinates(matrix,rows, cols);
        int row = coordinates[0];
        int col = coordinates[1];

        int rowRow = row;
        int colCol = col;

        boolean pizzaIsGet = false;


        while (true){
            String command = scanner.nextLine();
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
                matrix[rowRow][colCol] = " ";
                System.out.println("The delivery is late. Order is canceled.");
                printMatrix(matrix);
                return;
            }

            if (matrix[row][col].equals("*")){
                row = curRow;
                col = curCol;
            }

            if (matrix[row][col].equals("-") || matrix[row][col].equals(".")){
                matrix[row][col] = ".";
            }

            if (matrix[row][col].equals("P")){
                matrix[row][col] = "R";
                pizzaIsGet = true;
                System.out.println("Pizza is collected. 10 minutes for delivery.");
            }

            if (matrix[row][col].equals("A")){
                if (pizzaIsGet){
                    matrix[row][col] = "P";
                    System.out.println("Pizza is delivered on time! Next order...");
                    matrix[rowRow][colCol] = "B";
                    printMatrix(matrix);
                    return;

                }
            }
        }
    }

    public static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");
        }
    }

    public static int[] deliveryBoyCoordinates(String[][] matrix, int rows , int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col].equals("B")) {
                    matrix[row][col] = ".";
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
