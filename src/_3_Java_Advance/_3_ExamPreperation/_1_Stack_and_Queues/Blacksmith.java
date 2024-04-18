package _3_Java_Advance._3_ExamPreperation._1_Stack_and_Queues;

import java.util.*;
import java.util.stream.Collectors;

public class Blacksmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> steel = new ArrayDeque<>();
        Deque<Integer> carbon = new ArrayDeque<>();
        Map<String, Integer> swords = new TreeMap<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(steel::offer);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(carbon::push);

        int count = 0;

        while (!steel.isEmpty() && !carbon.isEmpty()) {
            int steelFirst = steel.peek();
            int carbonLast = carbon.peek();

            int sum = steelFirst + carbonLast;

            switch (sum) {
                case 70:
                    steel.poll();
                    carbon.poll();
                    count++;
                    swords.put("Gladius", swords.getOrDefault("Gladius", 0) + 1);
                    break;
                case 80:
                    steel.poll();
                    carbon.poll();
                    count++;
                    swords.put("Shamshir", swords.getOrDefault("Shamshir", 0) + 1);
                    break;
                case 90:
                    steel.poll();
                    carbon.poll();
                    count++;
                    swords.put("Katana", swords.getOrDefault("Katana", 0) + 1);
                    break;
                case 110:
                    steel.poll();
                    carbon.poll();
                    count++;
                    swords.put("Sabre", swords.getOrDefault("Sabre", 0) + 1);
                    break;
                default:
                    steel.poll();
                    if (!carbon.isEmpty()) {
                        int newVal = carbon.poll() + 5;
                        carbon.push(newVal);
                    }
            }
        }

        if (count >= 1) {
            System.out.printf("You have forged %d swords.%n", count);
        } else {
            System.out.println("You did not have enough resources to forge a sword.");
        }

        if (steel.isEmpty()) {
            System.out.println("Steel left: none");
        } else {
            List<String> data = steel.stream().map(Object::toString).collect(Collectors.toList());
            System.out.printf("Steel left: %s%n", String.join(", ", data));
        }

        if (carbon.isEmpty()) {
            System.out.println("Carbon left: none");
        } else {
            List<String> data = carbon.stream().map(Object::toString).collect(Collectors.toList());
            System.out.printf("Carbon left: %s%n", String.join(", ", data));
        }

        swords.forEach((k, v) -> {
            System.out.printf("%s: %d%n", k, v);
        });

    }
}
