package Java_Advance.ExamPreperation.First_Tasks;

import java.util.*;

public class OffroadChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Deque<Integer> fuelQuantity = new ArrayDeque<>();
        Deque<Integer> consumptionIndex = new ArrayDeque<>();
        Deque<Integer> fuelNeeded = new ArrayDeque<>();

        List<String> reached = new ArrayList<>();


        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(fuelQuantity::push);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(consumptionIndex::offer);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(fuelNeeded::offer);

        int size = fuelNeeded.size();

        int reachedAltitude = 0;
        int currentAltitude = 0;

        while (!fuelQuantity.isEmpty() && !consumptionIndex.isEmpty() && !fuelNeeded.isEmpty()) {
            int fuel = fuelQuantity.pop();
            int consumption = consumptionIndex.pop();
            int attitude = fuelNeeded.peek();

            currentAltitude += 1;

            if (fuel - consumption >= attitude) {
                fuelNeeded.pop();
                reachedAltitude++;

                System.out.printf("John has reached: Altitude %d%n", currentAltitude);
                String forPrint = "Altitude " + reachedAltitude;
                reached.add(forPrint);

            } else {
                System.out.printf("John did not reach: Altitude %d%n", currentAltitude);
                break;
            }
        }

        if (reachedAltitude == size) {
            System.out.println("John has reached all the altitudes and managed to reach the top!");
            return;
        }
        if (reachedAltitude > 0) {
            System.out.println("John failed to reach the top.");
            System.out.printf("Reached altitudes: %s", String.join(", ", reached));
        } else {
            System.out.println("John failed to reach the top.");
            System.out.println("John didn't reach any altitude.");

        }


    }
}
