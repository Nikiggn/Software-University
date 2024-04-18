package _3_Java_Advance._3_ExamPreperation._2_Multidimensional_Arrays;

import java.util.Scanner;

public class RallyRacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String raceNum = scanner.nextLine();

        String[][] matrix = new String[size][size];
        fillMatrix(matrix, scanner);

        int coveredKM = 0;
        int startingRow = 0;
        int startingCol = 0;

        boolean reachedFinish = false;

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("End")) {
                break;
            }

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

            if (matrix[startingRow][startingCol].equals(".")) {
                coveredKM += 10;
            } else if (matrix[startingRow][startingCol].equals("T")) {
                coveredKM += 30;
                matrix[startingRow][startingCol] = ".";
                int[] values = firstCoordinates(matrix);
                startingRow = values[0];
                startingCol = values[1];
                matrix[values[0]][values[1]] = ".";
            } else if (matrix[startingRow][startingCol].equals("F")) {
                matrix[startingRow][startingCol] = "C";
                coveredKM += 10;
                reachedFinish = true;
                break;
            }
        }

        if (reachedFinish) {

            System.out.printf("Racing car %s finished the stage!%nDistance covered %d km.%n", raceNum, coveredKM);
            for (String[] row : matrix) {
                for (String dot : row) {
                    System.out.print(dot);
                }
                System.out.println();
            }
        } else {
            matrix[startingRow][startingCol] = "C";
            System.out.printf("Racing car %s DNF.%n",raceNum);
            System.out.printf("Distance covered %d km.%n", coveredKM);
            for (String[] row : matrix) {
                for (String dot : row) {
                    System.out.print(dot);
                }
                System.out.println();
            }


        }

    }

    public static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
    }

    public static int[] firstCoordinates(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("T")) {
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }
}
