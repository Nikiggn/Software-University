package _24_ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _10_SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> results = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> submissions = new LinkedHashMap<>();


        while (true) {
            String command = scanner.nextLine();
            if (command.equals("exam finished")) {
                break;
            }

            String username = command.split("-")[0];
            String language = command.split("-")[1];


            if (!results.containsKey(username)) {

                if (!language.equals("banned")) {
                    int points = Integer.parseInt(command.split("-")[2]);
                    results.put(username, points);

                    if (!submissions.containsKey(language)) {
                        submissions.put(language, 1);
                    } else {
                        submissions.put(language, submissions.get(language) + 1);
                    }
                }


            } else {

                if (language.equals("banned")) {
                    results.remove(username);
                } else {
                    int points = Integer.parseInt(command.split("-")[2]);
                    if (results.get(username) < points) {
                        results.put(username, points);
                    }
                    if (!submissions.containsKey(language)) {
                        submissions.put(language, 1);
                    } else {
                        submissions.put(language, submissions.get(language) + 1);
                    }
                }
            }
        }

        System.out.printf("Results:%n");
        for (Map.Entry<String, Integer> entry : results.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
        System.out.printf("Submissions:%n");
        for (Map.Entry<String, Integer> entry : submissions.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
