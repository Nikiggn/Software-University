package _38_RegulaFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _2_ProblemTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String regex = "!(?<command>[A-Z][a-zA-Z]{2,})!:\\[(?<activity>[a-zA-Z]{8,})\\]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);

            if (matcher.find()) {

                String command = matcher.group("command");
                String activity = matcher.group("activity");
                StringBuilder forchars = new StringBuilder();
                for (int j = 0; j < activity.length(); j++) {
                    int chR = activity.charAt(j);
                    forchars.append(chR);
                    if (j != activity.length() - 1) {
                        forchars.append(" ");
                    }
                }
                System.out.printf("%s: %s%n", command, forchars.toString());
            } else {
                System.out.printf("The message is invalid%n");
            }
        }
    }
}
