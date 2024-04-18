package _3_Java_Advance._3_ExamPreperation._1_Stack_and_Queues;

import java.util.*;

public class ItsChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, String> chocolateTypes = new HashMap<>();
        chocolateTypes.put(30, "Milk Chocolate");
        chocolateTypes.put(50, "Dark Chocolate");
        chocolateTypes.put(100, "Baking Chocolate");

        Map<String, Integer> data = new TreeMap<>();

        Deque<Double> milkQuantity = new ArrayDeque<>();
        Deque<Double> cacaoPowderQuantity = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .forEach(milkQuantity::offer);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .forEach(cacaoPowderQuantity::push);

        while (!milkQuantity.isEmpty() && !cacaoPowderQuantity.isEmpty()) {
            double milk = milkQuantity.pop();
            double cacao = cacaoPowderQuantity.pop();
            int cacaoPercentage = (int) Math.round(100 * (cacao / (milk + cacao)));

            if (chocolateTypes.containsKey(cacaoPercentage)) {
                data.putIfAbsent(chocolateTypes.get(cacaoPercentage), 0);
                data.put(chocolateTypes.get(cacaoPercentage), data.get(chocolateTypes.get(cacaoPercentage)) + 1);
            } else {
                milk += 10;
                milkQuantity.offer(milk);
            }
        }

        if (data.size() == 3){
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
            printData(data);
        }else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
            printData(data);
        }
    }

    public static void printData(Map<String, Integer> data){
       data.forEach((k,v) ->{
           System.out.printf(" # %s --> %d%n",k,v);
       });
    }
}
