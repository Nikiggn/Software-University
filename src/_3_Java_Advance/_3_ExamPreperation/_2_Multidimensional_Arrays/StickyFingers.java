package _3_Java_Advance._3_ExamPreperation._2_Multidimensional_Arrays;

import java.util.Scanner;

public class StickyFingers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int size = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[size][size];
        String[] commands = scanner.nextLine().split(",");
        fillMatrix(matrix, scanner);

        int[] coordinates = coordinatesOfD(matrix);
        int startingRow = coordinates[0];
        int startingCol = coordinates[1];

        int moneyStolen = 0;

        for (int i = 0; i < commands.length; i++) {
            matrix[startingRow][startingCol] = "+";

            int curRow = startingRow;
            int curCol = startingCol;


            switch (commands[i]) {
                case "up":
                    startingRow -= 1;
                    break;
                case "down":
                    startingRow += 1;
                    break;
                case "left":
                    startingCol -=1;
                    break;

                case "right":
                    startingCol += 1;
                    break;
            }
            if (startingRow < 0 || startingRow == matrix.length || startingCol < 0 || startingCol == matrix.length) {
                System.out.println("You cannot leave the town, there is police outside!");
                startingRow = curRow;
                startingCol = curCol;
            }


            if (matrix[startingRow][startingCol].equals("$")){
                int moneyNow = startingRow * startingCol;
                moneyStolen += moneyNow;
                matrix[startingRow][startingCol] = "+";
                System.out.printf("You successfully stole %d$.%n", moneyNow);
            }

            else if (matrix[startingRow][startingCol].equals("P")) {
                System.out.printf("You got caught with %d$, and you are going to jail.%n", moneyStolen);
                matrix[startingRow][startingCol] = "#";
                for (String[] row : matrix) {
                    for (String dot : row) {
                        System.out.print(dot + " ");
                    }
                    System.out.println();
                }
                return;
            }
        }


        matrix[startingRow][startingCol] = "D";
        System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n",moneyStolen );
        for (String[] row : matrix) {
            for (String dot : row) {
                System.out.print(dot + " ");
            }
            System.out.println();
        }


    }

    public static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
    }

    public static int[] coordinatesOfD(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("D")) {
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }
}
