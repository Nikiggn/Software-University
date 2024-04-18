package _3_Java_Advance._1_Lab._3_Sets_and_Maps_Advanced;

import java.util.*;
import java.util.stream.Collectors;

public class _5_AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> gradeBook = new TreeMap<>();


        for (int i = 0; i < n ; i++) {
            String[] parts = scanner.nextLine().split("\\s+");
            String name = parts[0];
            Double grade = Double.parseDouble(parts[1]);

            gradeBook.putIfAbsent(name, new ArrayList<>());
            gradeBook.get(name).add(grade);

        }
        for (Map.Entry<String, List<Double>> entry: gradeBook.entrySet()) {
            String k = entry.getKey();
            List<Double> v = entry.getValue();

            String result = v.stream()
                    .map(g -> String.format("%.2f", g))
                    .collect(Collectors.joining(" "));
            double av = v.stream().mapToDouble(g -> g).sum() / v.size();

            System.out.printf("%s -> %s (avg: %.2f)%n", k,result, av);
        }
    }
}
