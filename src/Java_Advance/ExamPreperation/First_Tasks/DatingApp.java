package Java_Advance.ExamPreperation.First_Tasks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class DatingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> males = new ArrayDeque<>();
        Deque<Integer> females = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).forEach(males::push);
        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).forEach(females::offer);

        int matches = 0;

        while (!males.isEmpty() && !females.isEmpty()) {
            while (!males.isEmpty() && males.peek() <= 0) {
                males.poll();
                if (!males.isEmpty() && males.peek() % 25 == 0) {
                    males.poll();
                    males.poll();
                }
            }
            while (!females.isEmpty() && females.peek() <= 0) {
                females.poll();
            }

            while (!females.isEmpty() && females.peek() % 25 == 0) {
                females.poll();
                females.poll();
            }

            while (!males.isEmpty() && males.peek() % 25 == 0) {
                males.poll();
                males.poll();
            }

            if (!males.isEmpty() && !females.isEmpty() && males.peek().equals(females.peek())) {
                males.poll();
                females.poll();
                matches++;
            } else if (!females.isEmpty()) {
                females.poll();
                if (!males.isEmpty()) {
                    int newNum = males.poll() - 2;
                    if (newNum > 0) {
                        males.push(newNum);
                    }
                }
            }
        }

        String malesLeft = males.isEmpty() ? "none" : String.join(", ", males.stream().map(Object::toString).toArray(String[]::new));
        String femalesLeft = females.isEmpty() ? "none" : String.join(", ", females.stream().map(Object::toString).toArray(String[]::new));
        System.out.printf("Matches: %d%n", matches);
        System.out.printf("Matches: %d%n", matches);
        System.out.printf("Males left: %s%n", malesLeft);
        System.out.printf("Females left: %s%n", femalesLeft);

        System.out.println(0 % 25);
    }
}
