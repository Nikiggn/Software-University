package _24_ExerciseAssociativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class _8_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap<String, List<String>> info = new LinkedHashMap<>();

        while (true){
            String command = scanner.nextLine();
            if (command.equals("End")){
                break;
            }

            String companyName = command.split(" -> ")[0];
            String employeeId = command.split(" -> ")[1];

            if (info.containsKey(companyName)){
                List<String> cur = info.get(companyName);
                if (!cur.contains(employeeId)){
                    cur.add(employeeId);
                }
            }else {
                info.put(companyName, new ArrayList<>());
                info.get(companyName).add(employeeId);
            }
        }

        info.entrySet().forEach(e -> {
            System.out.println(e.getKey());
            e.getValue().forEach(empl -> System.out.println("-- " + empl));
        });
    }
}
