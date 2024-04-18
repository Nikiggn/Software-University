package _3_Java_Advance._1_Lab._3_Sets_and_Maps_Advanced;

import java.util.*;

public class _4_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .toList();

        Map<Double, Integer> ops = new LinkedHashMap<>();

        for (Double el : nums) {
            ops.putIfAbsent(el,0);
            int newcount = ops.get(el) + 1;
            ops.put(el, newcount);
        }

        ops.forEach((k,v) ->{
            System.out.printf("%.1f -> %d%n",k, v);
        });

    }
}
