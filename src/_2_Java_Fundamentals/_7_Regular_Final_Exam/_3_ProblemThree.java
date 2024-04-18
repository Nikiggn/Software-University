package _38_RegulaFinalExam;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _3_ProblemThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int capacity = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Integer> info = new LinkedHashMap<>();


        while (true){
            String command = scanner.nextLine();
            if (command.equals("Statistics")){
                break;
            }

            String[] parts = command.split("=");

            String order = parts[0];

            switch (order){
                case "Add":
                    String username =  parts[1];
                    int sentMes = Integer.parseInt(parts[2]);
                    int receivedMes = Integer.parseInt(parts[3]);

                    if (!info.containsKey(username)){
                        info.put(username, sentMes + receivedMes);
                    }
                    break;


                case "Message":
                    String sender = parts[1];
                    String receiver= parts[2];
                    if (info.containsKey(sender) && info.containsKey(receiver)){
                        info.put(sender, info.get(sender) + 1);
                        info.put(receiver, info.get(receiver) + 1);
                    }else {
                        break;
                    }
                    if (info.get(sender) >= capacity){
                        info.remove(sender);
                        System.out.printf("%s reached the capacity!%n", sender);
                    }
                    if (info.get(receiver) >= capacity) {
                        info.remove(receiver);
                        System.out.printf("%s reached the capacity!%n", receiver);
                    }
                    break;

                case "Empty":
                    String userName = parts[1];

                    if (userName.equals("All")){
                      info.clear();
                    }else {
                        info.remove(userName);
                    }
                    break;
            }
        }
        if (!info.isEmpty()){
            System.out.printf("Users count: %d%n", info.size());
            for (Map.Entry<String, Integer> entry:info.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
