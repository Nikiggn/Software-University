package Java_Advance.ExamPreperation.First_Tasks;
import java.util.*;
import java.util.stream.Collectors;
public class TempleofDoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> tools = readSequence(scanner);
        Deque<Integer> substances = readSequence(scanner);
        List<Integer> challenges = readChallenges(scanner);

        processChallenges(tools, substances, challenges);
        printResults(tools, substances,challenges);
    }
    private static Deque<Integer> readSequence(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));
    }
    private static List<Integer> readChallenges(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
    private static void processChallenges(Deque<Integer> tools, Deque<Integer> substances, List<Integer> challenges) {
        while (!tools.isEmpty() && !substances.isEmpty() && !challenges.isEmpty()) {
            int tool = tools.pop();
            int substance = substances.pollLast();
            int num = tool * substance;

            if (challenges.contains(num)) {
                challenges.remove(Integer.valueOf(num));
            } else {
                tool += 1;
                tools.offer(tool);

                substance -= 1;
                if (substance > 0) {
                    substances.offer(substance);
                }
            }
        }
    }



    private static void printResults(Deque<Integer> tools, Deque<Integer> substances, List<Integer> challenges) {
        if (tools.isEmpty() || substances.isEmpty()) {
            if (!challenges.isEmpty()) {
                System.out.println("Harry is lost in the temple. Oblivion awaits him.");
            }
        }

        if (challenges.isEmpty()) {
            System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");
        }

        if (!tools.isEmpty()) {
            System.out.printf("Tools: %s%n", tools.stream().map(Object::toString).collect(Collectors.joining(", ")));
        }

        if (!substances.isEmpty()) {
            System.out.printf("Substances: %s%n", substances.stream().map(Object::toString).collect(Collectors.joining(", ")));
        }

        if (!challenges.isEmpty()) {
            System.out.printf("Challenges: %s%n", challenges.stream().map(Object::toString).collect(Collectors.joining(", ")));
        }
    }
}
