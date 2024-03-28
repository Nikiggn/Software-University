package Java_Advance.ExamPreperation.Second_Tasks;

import java.util.Scanner;

public class TheGambler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size =Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[size][size];
        fillTheMatrix(matrix, scanner);

        int[] coordinates = ourCoordinates(matrix);
        int startingRow = coordinates[0];
        int startingCol = coordinates[1];
        matrix[startingRow][startingCol] = "-";

        int money  = 100;

        while (true){
            String command = scanner.nextLine();
            if (command.equals("end")){
                break;
            }

            switch (command){
                case "up":
                    startingRow -= 1;
                    break;
                case "down":
                    startingRow += 1;
                    break;
                case "left":
                    startingCol -= 1;
                    break;
                case "right":
                    startingCol += 1;
                    break;
            }

            if (matrix[startingRow][startingCol].equals("W")){
                matrix[startingRow][startingCol] = "-";
                money += 100;
            } else if (matrix[startingRow][startingCol].equals("P")) {
                matrix[startingRow][startingCol] = "-";
                money -= 200;
            } else if (matrix[startingRow][startingCol].equals("J")) {
                matrix[startingRow][startingCol] = "G";
                money += 100000;
                System.out.printf("You win the Jackpot!%nEnd of the game. Total amount: %d$%n", money);
                printMatrix(matrix);
                return;
            }

           if (checking(matrix, startingRow, startingCol, money)){
               continue;
           }else {
               System.out.println("Game over! You lost everything!");
               return;
           }
        }

        System.out.printf("End of the game. Total amount: %d$%n", money);
        matrix[startingRow][startingCol] = "G";
        printMatrix(matrix);
    }


    public static void fillTheMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");
        }
    }

    public static int[] ourCoordinates(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("G")) {
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }


    public static boolean checking(String[][] matrix, int startingRow, int startingCol, int money){
        if (startingRow < 0 || startingRow >= matrix.length || startingCol < 0 || startingCol >= matrix.length || money <= 0){
            return false;
        }
        return true;
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
