package Java_Advance._3_LabMultidimensionalArrays;

import java.util.Scanner;

public class _7_FindtheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[8][8];
        int[][] cordinates = new int[1][1];
        fillMatrix(matrix, scanner);




//       checkByRow(matrix);
//        checkByCollum(matrix);
//        checkByPrimalDiagonal(matrix);
//        checkBySecondaryDiagonal(matrix);




    }

//    private static boolean checkByRow(char[][] matrix) {
//        for (int row = 0; row < 8; row++) {
//            for (int col = 0; col < 8; col++) {
//                int numChar = matrix[row][col];
//                int e = 'q';
//
//                if (numChar == e){
//
//                    for (int ro = 0; ro < 8; ro++) {
//
//                    }
//                }
//            }
//        }
//
//    }

    private static void fillMatrix(char[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().replaceAll("\\s+", "")
                    .toCharArray();
        }
    }


}
