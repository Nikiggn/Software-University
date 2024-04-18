package _3_Java_Advance._1_Lab._2_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _6_PrintDiagonalsofSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dim = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[dim][dim];

        for (int row = 0; row < dim; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }


        int[][] res = new int[2][dim];

        int topLeftBottomRight= 0;
        int col = 0;
        int BottomLeftTopRight = dim -1;

        for (int i = 0; i < dim; i++) {
            res[0][col] =  matrix[topLeftBottomRight][col];
            res[1][col] = matrix[BottomLeftTopRight][col];
            col += 1;
            topLeftBottomRight += 1;
            BottomLeftTopRight -=1;

        }

        printRes(res);
    }
    public  static  void printRes(int[][] arr){
        for (int row = 0; row < arr.length ; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < arr[row].length; col++) {
                sb.append(arr[row][col]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }

    }
}
