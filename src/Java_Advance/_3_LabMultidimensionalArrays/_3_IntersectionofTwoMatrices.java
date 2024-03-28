package Java_Advance._3_LabMultidimensionalArrays;

import java.util.Scanner;

public class _3_IntersectionofTwoMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[rows][cols];
        char[][] secoondMatrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            firstMatrix[row] = scanner.nextLine().replaceAll("\\s+", "")
                    .toCharArray();
        }
        for (int row = 0; row < rows; row++) {
            secoondMatrix[row] = scanner.nextLine().replaceAll("\\s+", "")
                    .toCharArray();
        }

        char[][] resulTmATRIX = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
             char first = firstMatrix[row][col];
             char second = secoondMatrix[row][col];
             if (first==second){
                 resulTmATRIX[row][col] = first;
             }else {
                 resulTmATRIX[row][col] = '*';
             }
            }
        }


        for (char[] row: resulTmATRIX) {
            for (char ch: row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }


    }


}
