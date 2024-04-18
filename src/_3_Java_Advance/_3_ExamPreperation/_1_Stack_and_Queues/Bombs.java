package _3_Java_Advance._3_ExamPreperation._1_Stack_and_Queues;

import java.util.*;

public class Bombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] part1 = scanner.nextLine().split(", ");
        String[] part2 = scanner.nextLine().split(", ");

        Deque<Integer> effects = new ArrayDeque<>();
        Deque<Integer> casing = new ArrayDeque<>();
        Map<String, Integer> count = new TreeMap<>();

        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).forEach(effects::offer);
        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).forEach(casing::push);


//        for (int i = 0; i < part1.length; i++) {
//            effects.offer(Integer.parseInt(part1[i]));
//        }
//
//        for (int i = part2.length - 1; i >= 0; i--) {
//            casing.offer(Integer.parseInt(part2[i]));
//        }

        count.put("Datura Bombs:", 0);
        count.put("Cherry Bombs:", 0);
        count.put("Smoke Decoy Bombs:", 0);


        while (!effects.isEmpty() && !casing.isEmpty()) {
            if (count.getOrDefault("Datura Bombs:", 0) >= 3 &&
                    count.getOrDefault("Cherry Bombs:", 0) >= 3 &&
                    count.getOrDefault("Smoke Decoy Bombs:", 0) >= 3) {
                System.out.println("Bene! You have successfully filled the bomb pouch!");
                break;
            }

            int num = effects.peek() + casing.peek();

            if (num == 40) {
                count.put("Datura Bombs:", count.get("Datura Bombs:") + 1);
                effects.poll();
                casing.poll();
            } else if (num == 60) {
                count.put("Cherry Bombs:", count.get("Cherry Bombs:") + 1);
                effects.poll();
                casing.poll();
            } else if (num == 120) {
                count.put("Smoke Decoy Bombs:", count.get("Smoke Decoy Bombs:") + 1);
                effects.poll();
                casing.poll();
            } else {
                int newNum = casing.poll() - 5;
                casing.push(newNum);

            }
        }
        boolean d = true;

        if (count.getOrDefault("Datura Bombs:", 0) != 3 &&
                count.getOrDefault("Cherry Bombs:", 0) != 3 &&
                count.getOrDefault("Smoke Decoy Bombs:", 0) != 3) {
            System.out.println("You don't have enough materials to fill the bomb pouch.");

        }

        if (effects.isEmpty()) {
            System.out.println("Bomb Effects: empty");
        } else {
            String bhifb = String.join(", ", effects.stream().map(Object::toString).toArray(String[]::new));
            System.out.printf("Bomb Effects: %s%n", bhifb);
        }

        if (casing.isEmpty()) {
            System.out.println("Bomb Casings: empty");
        } else {
            String bhifb = String.join(", ", casing.stream().map(Object::toString).toArray(String[]::new));
            System.out.printf("Bomb Casings: %s%n", bhifb);

        }

        System.out.printf("Cherry Bombs: %d%n", count.get("Cherry Bombs:"));
        System.out.printf("Datura Bombs: %d%n", count.get("Datura Bombs:"));
        System.out.printf("Smoke Decoy Bombs: %d%n", count.get("Smoke Decoy Bombs:"));


    }
}
