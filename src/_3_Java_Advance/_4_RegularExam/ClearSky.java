package _3_Java_Advance._4_RegularExam;

import java.util.Scanner;

public class ClearSky {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int size = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[size][size];
        fillMatrix(matrix,scanner);

        int[] coordinates = jetCoordinates(matrix);
        int row = coordinates[0];
        int col = coordinates[1];


        int armor = 300;
        int enemies = enemyFinder(matrix);

        while (enemies != 0){
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

            if (matrix[row][col].equals("E")){
                matrix[row][col] = "-";
                armor -= 100;
                enemies -=1;

                if (armor == 0){
                    matrix[row][col] = "J";
                    System.out.printf("Mission failed, your jetfighter was shot down! Last coordinates [%d, %d]!%n",row,col);
                    printMatrix(matrix);
                    return;
                }
            }

            if (matrix[row][col].equals("R")){
                matrix[row][col] = "-";
                armor = 300;
            }
        }

        if (enemies == 0){
            matrix[row][col] = "J";
            System.out.println("Mission accomplished, you neutralized the aerial threat!");
            printMatrix(matrix);
        }


    }

    public static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");
        }
    }

    public static int[] jetCoordinates(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("J")) {
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

    public static int enemyFinder(String[][] matrix) {
        int enemies = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("E")) {
                    enemies++;
                }
            }
        }
        return enemies;
    }
}
