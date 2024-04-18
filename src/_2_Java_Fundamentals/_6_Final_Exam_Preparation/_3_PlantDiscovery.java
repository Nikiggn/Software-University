package _35_FinalExamPreparation;
import java.util.*;

public class _3_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Integer> info = new LinkedHashMap<>();
        LinkedHashMap<String, List<Double>> ratingInfo = new LinkedHashMap<>();


        for (int i = 0; i < n ; i++) {
            String com = scanner.nextLine();
            String[] parst = com.split("<->");
            String plant =parst[0];
            int rarity = Integer.parseInt(parst[1]);

            if (!info.containsKey(plant)){
                info.put(plant, rarity);
            }else {
                info.put(plant, info.get(plant) + rarity);
            }
        }

        while (true){
            String command = scanner.nextLine();
            if (command.equals("Exhibition")){
                break;
            }

            String order = command.split(": ")[0];
            String plant  = command.split(": ")[1].split(" - ")[0];

            switch (order){
                case "Rate":
                    if (!info.containsKey(plant)){
                        break;
                    }
                    double rating = Double.parseDouble(command.split(": ")[1].split(" - ")[1]);
                    List<Double> newlist = ratingInfo.get(plant);
                    newlist.set(0,rating);
                    ratingInfo.put(plant,newlist );
                    break;
                case "Update":
                    if (!info.containsKey(plant)){
                        break;
                    }
                    int newRarity = Integer.parseInt(command.split(": ")[1].split(" - ")[1]);
                    info.put(plant, newRarity);
                    break;
                case "reset":
                    if (!info.containsKey(plant)){
                        break;
                    }
                    List<Double> newlist1 = new ArrayList<>();
                    ratingInfo.put(plant, newlist1);
                    break;
            }
        }


        System.out.println("Plants for the exhibition:");
        System.out.println();
        for (Map.Entry<String, Integer> entry:info.entrySet()) {
            System.out.printf("- %s; Rarity: %d; Rating: {average_rating}%n",entry.getKey(), entry.getValue());

        }
    }
}
