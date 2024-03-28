package Java_Advance.ExamPreperation.First_Tasks;

import java.util.*;
import java.util.stream.Collectors;

public class EnergyDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Deque<Integer> milligramsCaffeine = new ArrayDeque<>();
        Deque<Integer> energyDrinks = new ArrayDeque<>();

        int maximumCaffeine = 0;

        Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .forEach(milligramsCaffeine::push);

        Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .forEach(energyDrinks::offer);

        while (!milligramsCaffeine.isEmpty() && !energyDrinks.isEmpty()) {
            int milligrams = milligramsCaffeine.pop();
            int drink = energyDrinks.pop();
            int caffeine = milligrams * drink;


            if (maximumCaffeine + caffeine <= 300) {
                maximumCaffeine += caffeine;
            } else {
                maximumCaffeine -= 30;
                if (maximumCaffeine < 0){
                    maximumCaffeine = 0;
                }
                energyDrinks.offer(drink);
            }

        }

        if (!energyDrinks.isEmpty()){
            List<String> res = energyDrinks.stream().map(Object::toString).collect(Collectors.toList());
             System.out.printf("Drinks left: %s%n" ,String.join(", ",res ));
        }else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }

        System.out.printf("Stamat is going to sleep with %d mg caffeine.",maximumCaffeine);

    }
}
