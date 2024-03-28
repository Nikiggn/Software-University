package Java_Advance.ExamPreperation.First_Tasks;

import java.util.*;

public class ApocalypsePreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> textiles = new ArrayDeque<>();
        Deque<Integer> medicaments = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(textiles::offer);

        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(medicaments::push);

        Map<String, Integer> data = new LinkedHashMap<>();


        while (!textiles.isEmpty() && !medicaments.isEmpty()) {
            int sum = textiles.peek() + medicaments.peek();

            if (sum > 100){
                textiles.pop();
                medicaments.pop();
                int newVal = (sum - 100) + medicaments.pop() ;
                data.put("MedKit", data.get("MedKit") + 1);
                medicaments.push(newVal);
            }else if (sum != 30 || sum != 40){
                textiles.pop();
                int newVal = medicaments.pop() + 10;
                medicaments.push(newVal);
            }

            if (sum == 30) {
                data.putIfAbsent("Patch", 0);
                data.put("Patch", data.get("Patch") + 1);
                textiles.pop();
                medicaments.pop();
            } else if (sum == 40) {
                data.putIfAbsent("Bandage", 0);
                data.put("Bandage", data.get("Bandage") + 1);
                textiles.pop();
                medicaments.pop();
            } else if (sum == 100) {
                data.putIfAbsent("MedKit", 0);
                data.put("MedKit", data.get("MedKit") + 1);
                textiles.pop();
                medicaments.pop();
            }

        }

        if (textiles.isEmpty()){
            System.out.println("Textiles are empty.");
        } else if (medicaments.isEmpty()) {
            System.out.println("Medicaments are empty.");
        }else {
            System.out.println("Textiles and medicaments are both empty.");
        }

        if (!data.isEmpty()){
           data.forEach((k,v) ->{
               System.out.printf("%s - %d%n", k, v);
           });
        }

        if (!medicaments.isEmpty()){
            System.out.println("Medicaments left: ");
            StringBuilder sb = new StringBuilder();
            for (int a: medicaments) {
                sb.append(a + ", ");
            }
            System.out.print(sb.toString().trim());
        }

    }
}
