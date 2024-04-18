package _23_AssociativeArrays;

import java.util.*;

public class _2_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<String>> synonyms = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String name = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!synonyms.containsKey(name)){
                synonyms.put(name,new ArrayList<>());
            }
            synonyms.get(name).add(synonym);
        }
        for (Map.Entry<String, List<String>> kvp : synonyms.entrySet()) {
            System.out.printf("%s - %s%n", kvp.getKey(),
                    String.join(", ",kvp.getValue()));

        }
    }
}
