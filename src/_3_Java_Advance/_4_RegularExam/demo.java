package _3_Java_Advance._4_RegularExam;

public class demo {

}

/*

        int size = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[size][size];
        fillMatrix(matrix,scanner);


     public static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");
        }
    }
    -------------------------------------------------------------
    //find starting coordinates

    int[] coordinates = beeCoordinates(matrix);
        int row = coordinates[0];
        int col = coordinates[1];

    public static int[] bb(String[][] matrix) {
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
 --------------------------------------------------------------------------
 // print matrix

 private static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String dot : row) {
                System.out.print(dot);
            }
            System.out.println();
        }
    }
    --------------------------------------------------------------------------

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

    ---------------------------------------------------------------------------
    // out of bounds
     if (outOfBounds(matrix, row, col))
                           (rows)                                 (cols)
    public static boolean outOfBounds(String[][] matrix, int row, int col) {
        if (row < 0 || row == matrix.length || col < 0 || col == matrix.length) {
            return true;
        }
        return false;
    }

       ----------------------------------------------------------------------------

        String[] dimensions = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[0]);

      -------------------------------------------------------------------------
      // list of players
       public static List<String> players(String[][] matrix) {
        List<String> players = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("P")) {
                    players.add(matrix[row][col]);
                }
            }
        }
        return players;
    }

    ------------------------------------------------------------------------

go on the other side
 if (col == size) {
                col = 0;
            } else if (col < 0) {
                col = size - 1;
            }

            if (row == size) {
                row = 0;
            } else if (row < 0) {
                row = size - 1;
            }

 */



