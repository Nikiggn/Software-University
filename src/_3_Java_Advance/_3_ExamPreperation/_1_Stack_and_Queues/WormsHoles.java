package _3_Java_Advance._3_ExamPreperation._1_Stack_and_Queues;

import java.util.*;
import java.util.stream.Collectors;

public class WormsHoles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> worms = new ArrayDeque<>();
        Deque<Integer> holes = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(worms::push);

        int size = 0;
        for (int i = 0; i < worms.size(); i++) {
            size += 1;
        }

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(holes::offer);

        int matches = 0;

        while (!worms.isEmpty() && !holes.isEmpty()) {
            int worm = worms.pop();
            int hole = holes.pop();

            if (worm != hole) {
                worm -= 3;
                if (worm > 0) {
                    worms.push(worm);
                }
            } else {
                matches++;
            }
        }

        if (matches > 0) {
            System.out.printf("Matches: %d%n", matches);
        } else {
            System.out.println("There are no matches.");
        }

        if (worms.isEmpty() && size == matches) {
            System.out.println("Every worm found a suitable hole!");
        } else if (worms.isEmpty()) {
            System.out.println("Worms left: none");
        } else {
            Deque<Integer> wormsLeft = new ArrayDeque<>();
            for (int a : worms) {
                wormsLeft.push(a);
            }
            List<String> res = wormsLeft.stream().map(Object::toString).collect(Collectors.toList());
            System.out.printf("Worms left: %s%n", String.join(", ", res));
        }

        if (holes.isEmpty()) {
            System.out.println("Holes left: none");
        } else {
            List<String> res = holes.stream().map(Object::toString).collect(Collectors.toList());
            System.out.printf("Holes left: %s%n", String.join(", ", res));
        }

    }
}
