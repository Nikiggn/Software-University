package _24_ExerciseAssociativeArrays;

import java.security.Key;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _3_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> orders = new LinkedHashMap<>();
        while (true){
            String command = scanner.nextLine();
            if (command.equals("buy")){
                break;
            }
            String product  =command.split(" ")[0];
            double price = Double.parseDouble(command.split(" ")[1]);
            int quantity = Integer.parseInt(command.split(" ")[2]);

            if (!orders.containsKey(product)){
                orders.put(product, quantity);
            }else {
                orders.put(product,  orders.get(product) + quantity);
            }


            System.out.printf( "%s -> %.2f%n",product,orders.get(product) * price );


        }



    }
}
