package Java_Advance._6_ExercisesSetsandMapsAdvanced;

import java.util.*;

public class _8_UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //IP={IP.Address} message={A&sample&message} user={username}"

        Map<String, Map<String, Integer>> data = new TreeMap<>();
        //  user         ip      mess

        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }

            String[] parts = input.split("\\s+");

            String ip = parts[0].substring(3, parts[0].length()- 1 +1);
            String user = parts[2].substring(5, parts[2].length()- 1 +1);

            data.putIfAbsent(user, new LinkedHashMap<>());
            data.get(user).put(ip, data.get(user).getOrDefault(ip,0) + 1);

        }


        data.forEach((user, ips) -> {
            System.out.printf("%s:%n", user);
            List<String> entries = new ArrayList<>();
            ips.forEach((ip, count) -> entries.add(String.format("%s => %d", ip, count)));
            String result = String.join(", ", entries);
            if (!result.isEmpty()) {
                System.out.println(result + ".");
            }

        });


    }
}
