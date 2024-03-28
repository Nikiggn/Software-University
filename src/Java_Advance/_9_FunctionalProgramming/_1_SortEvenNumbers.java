package Java_Advance._9_FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(String.join(", ", nums.stream().map(Object::toString).toArray(String[]::new)));
        Collections.sort(nums);
        System.out.println(String.join(", ", nums.stream().map(Object::toString).toArray(String[]::new)));
    }
}
