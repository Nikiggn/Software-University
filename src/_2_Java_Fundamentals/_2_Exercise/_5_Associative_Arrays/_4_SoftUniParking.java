package _24_ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _4_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> parkingLot = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String command = scanner.nextLine();
            String[] comandParts = command.split(" ");

            String order = comandParts[0];
            String name = comandParts[1];


            switch (order){
                case "register":
                    String plateNum = comandParts[2];

                    if (parkingLot.containsKey(name)){
                        System.out.printf("ERROR: already registered with plate number %s%n", parkingLot.get(name));
                    }else  {
                        parkingLot.put(name,plateNum);
                        System.out.printf("%s registered %s successfully%n",name, plateNum);
                    }
                    break;
                case "unregister":
                    if (!parkingLot.containsKey(name)){
                        System.out.printf("ERROR: user %s not found%n", name);
                    } else {
                        parkingLot.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry : parkingLot.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
