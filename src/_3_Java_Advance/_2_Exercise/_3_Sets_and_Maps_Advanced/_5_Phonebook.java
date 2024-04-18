package _3_Java_Advance._2_Exercise._3_Sets_and_Maps_Advanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _5_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, String> phoneBook = new LinkedHashMap<>();

        while(true){
            String com = scanner.nextLine();

            if (com.equals("search")){
                while (true){
                    String names = scanner.nextLine();
                    if (names.equals("stop")){
                        return;
                    }
                    if (phoneBook.containsKey(names)){
                        System.out.printf(names + " -> " + phoneBook.get(names)+ "%n");
                    }else {
                        System.out.printf("Contact %s does not exist.%n", names);
                    }
                }

            }else {
                String name = com.split("-")[0];
                String phone = com.split("-")[1];
                phoneBook.put(name, phone);
            }
        }
    }
}
