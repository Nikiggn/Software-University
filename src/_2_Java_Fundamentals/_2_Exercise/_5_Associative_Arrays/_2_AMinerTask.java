package _24_ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _2_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap<String , Integer> inventory = new LinkedHashMap<>();

        while (true){
            String resource = scanner.nextLine();
            if (resource.equals("stop")){
                break;
            }
            int  quantity = Integer.parseInt(scanner.nextLine());



            if (inventory.containsKey(resource)){
                inventory.put(resource, inventory.get(resource) + quantity);
            }else {
                inventory.put(resource, quantity);
            }
        }

        for (Map.Entry<String, Integer> entry: inventory.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
