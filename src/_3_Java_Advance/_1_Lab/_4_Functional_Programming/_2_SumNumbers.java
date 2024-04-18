package _3_Java_Advance._1_Lab._4_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _2_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<String, Integer> bri = x -> Integer.parseInt(x);
        List<Integer> nums= Arrays.stream(scanner.nextLine().split(",\\s+"))
                .map(bri)
                .collect(Collectors.toList());

        int count = nums.size();
        int sum = nums.stream().mapToInt(x -> x.intValue()).sum();

        System.out.printf("Count = %d%n", count);
        System.out.printf("Sum = %d%n", sum);

    }
}
