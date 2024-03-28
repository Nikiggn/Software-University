package Java_Advance._3_LabMultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _1_CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimension  = readFromConsole(scanner);
        int firstRow = dimension[0];
        int firstCol = dimension[1];
        int[][] firstMatrix = new int[firstRow][firstCol];
        for (int row = 0; row < firstRow; row++) {
            firstMatrix[row] = readFromConsole(scanner);
        }

        int[] dimension2  = readFromConsole(scanner);
        int secondRow = dimension2[0];
        int secondCol = dimension2[1];
        int[][] secondMatrix = new int[firstRow][firstCol];
        for (int row = 0; row < secondRow; row++) {
            secondMatrix[row] = readFromConsole(scanner);
        }

    }


//    public static boolean checks(int[] arr1, int[] arr2){
//        if (arr1.length != arr2.length){return false;}
//        boolean v = true;
//
//    }
    public  static int[] readFromConsole(Scanner scanner){
        return  Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
