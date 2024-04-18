package _23_AssociativeArrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _1_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        TreeMap<Double, Integer> numberCount = new TreeMap<>();
        double[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double:: parseDouble)
                .toArray();
        for (double num: nums) {

            if (numberCount.containsKey(num)){
                numberCount.put(num, numberCount.get(num) + 1);
                
            }else {
                numberCount.put(num, 1);
            }
        }

        for (Map.Entry<Double, Integer> kvp: numberCount.entrySet()) {
            System.out.printf("%.0f -> %d%n",kvp.getKey(), kvp.getValue());
        }

    }
}
