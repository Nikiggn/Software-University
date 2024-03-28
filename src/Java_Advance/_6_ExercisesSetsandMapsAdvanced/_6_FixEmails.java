package Java_Advance._6_ExercisesSetsandMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _6_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> fixedEmails = new LinkedHashMap<>();

        while (true){
            String name = scanner.nextLine();
            if (name.equals("stop")){
                break;
            }
            String email = scanner.nextLine();
            if (!email.toLowerCase().endsWith(".us") && !email.toLowerCase().endsWith(".uk") && !email.toLowerCase().endsWith(".com")) {
                fixedEmails.put(name, email);
            }
        }
        fixedEmails.forEach((k,v) ->{

            System.out.printf("%s -> %s%n", k, v);
        });
    }
}
