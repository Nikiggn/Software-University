package _24_ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _6_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Double> info = new LinkedHashMap<>();
        for (int i = 1; i <= n ; i++) {
            String studentsName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!info.containsKey(studentsName)){
                info.put(studentsName, grade);
            } else  {
                info.put(studentsName, (info.get(studentsName) + grade) / 2);
            }

        }
        for (Map.Entry<String, Double> entry: info.entrySet()) {
            if (entry.getValue() >= 4.5){
                System.out.printf("%s -> %.2f%n",entry.getKey(), entry.getValue());
            }
        }


    }
}
