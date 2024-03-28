package Java_Advance.RegularExam;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class ChickenSnack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> moneyInPocket = new ArrayDeque<>();
        Deque<Integer> pricesOfFood = new ArrayDeque<>();


        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(moneyInPocket::push);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(pricesOfFood::offer);

        int boughtFood = 0;


        while (!moneyInPocket.isEmpty() && !pricesOfFood.isEmpty()){
            int money = moneyInPocket.pop();
            int price = pricesOfFood.pop();


            if (money == price){
                boughtFood ++;
            } else if (money > price) {
                boughtFood ++;
                money = money - price;
                if (!moneyInPocket.isEmpty() && !pricesOfFood.isEmpty()){
                    int newVal = moneyInPocket.pop() + money;
                    moneyInPocket.push(newVal);
                }
            }
        }

        if (boughtFood >= 4){
            System.out.printf("Gluttony of the day! Henry ate %d foods.%n", boughtFood);
        } else if (boughtFood == 1) {
            System.out.println("Henry ate: 1 food.");
        }else  if (boughtFood == 0){
            System.out.println("Henry remained hungry. He will try next weekend again.");
        }else {
            System.out.printf("Henry ate: %d foods.%n", boughtFood);
        }



    }
}
