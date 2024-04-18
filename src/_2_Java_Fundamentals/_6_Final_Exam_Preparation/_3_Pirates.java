package _35_FinalExamPreparation;

import java.util.*;

public class _3_Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<Integer>> townsINFO = new LinkedHashMap<>();
       // List<Integer> numbers = new ArrayList<>();

        while (true){
            String command = scanner.nextLine();
            if (command.equals("Sail")){
                break;
            }

            String townName = command.split("\\|\\|")[0];
            int citizens = Integer.parseInt(command.split("\\|\\|")[1]);
            int goldKg = Integer.parseInt(command.split("\\|\\|")[2]);


            if (!townsINFO.containsKey(townName)){
                List<Integer> values = townsINFO.computeIfAbsent(townName, k -> new ArrayList<>());
                values.add(citizens);
                values.add(goldKg);
                townsINFO.put(townName, values);
            }else {
                List<Integer> exValue = townsINFO.get(townName);
                exValue.set(0, exValue.get(0) + citizens);
                exValue.set(1, exValue.get(1) + goldKg);
                townsINFO.put(townName, exValue);
            }
        }

        while (true){
            String com = scanner.nextLine();
            if (com.equals("end")){
                break;
            }



            String event = com.split("=>")[0];

            String town = com.split("=>")[1];

            switch (event){
                case "Plunder":
                    int people = Integer.parseInt(com.split("=>")[2]);
                    int gold = Integer.parseInt(com.split("=>")[3]);

                    List<Integer> absNew = townsINFO.get(town);
                    absNew.set(0, absNew.get(0) - people);
                    absNew.set(1, absNew.get(1) - gold);

                    int containsOfpeople = absNew.get(0);
                    int containsOfgold = absNew.get(1);

                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",town,gold, people );

                    if (containsOfpeople <= 0 || containsOfgold <= 0){
                        townsINFO.remove(town);
                        System.out.printf("%s has been wiped off the map!%n",town);
                    }
                    break;

                case "Prosper":
                    int goldProsper = Integer.parseInt(com.split("=>")[2]);
                    if (goldProsper < 0){
                        System.out.printf("Gold added cannot be a negative number!%n");
                    }else {
                        List<Integer> finalList = townsINFO.get(town);
                        finalList.set(1, finalList.get(1) + goldProsper);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", goldProsper, town, finalList.get(1));
                    }
                    break;
            }
        }

        if (!townsINFO.isEmpty()){
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", townsINFO.size());
            ///List<Integer> finalFinal = townsINFO.get();
            for (Map.Entry<String, List<Integer>> entry: townsINFO.entrySet()) {
                List<Integer> finalList = entry.getValue();
                System.out.println(entry.getKey() + " -> Population: " + finalList.get(0) +  " citizens, Gold: " + finalList.get(1) + " kg");
            }
        }else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
