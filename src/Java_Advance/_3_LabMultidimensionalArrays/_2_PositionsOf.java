package Java_Advance._3_LabMultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _2_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dim = readFromConsole(scanner);
        int rows  = dim[0];
        int cols = dim[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine()
                            .split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }

        int numToFind = Integer.parseInt(scanner.nextLine());

        String result = checks(matrix, numToFind);
        System.out.println(result);

    }

    public  static int[] readFromConsole(Scanner scanner){
        return  Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public  static String checks(int[][] matrix, int numToFind){
        List<String> occurrences = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length ; col++) {
                if (matrix[row][col] == numToFind){
                    occurrences.add(row + " " + col);
                }
            }
        }

        if (occurrences.isEmpty()){
            return "not found";
        }else {
            return String.join("\n", occurrences);
        }
    }
}
