package Java_Advance._6_ExercisesSetsandMapsAdvanced;

import java.util.*;

public class _10_LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());

            Map<String, Map<String, Integer>> data = new TreeMap<>() ;

           // Map<String, Integer> durationCounter = new

        for (int i = 0; i < n; i++) {
            String accessLog = scanner.nextLine();
            String ip = accessLog.split("\\s+")[0];
            String user = accessLog.split("\\s+")[1]; // key
            int duration = Integer.parseInt(accessLog.split("\\s+")[2]);

            data.putIfAbsent(user,  new TreeMap<>());
            data.get(user).put(ip,data.get(user).getOrDefault(ip,0) + duration);
        }

        data.forEach((k, v) ->{
            int total = v.values().stream().mapToInt(Integer::intValue).sum();
            Set<String> uniqIp =v.keySet();


            System.out.printf("%s: %d [%s]%n", k, total, String.join(", ",uniqIp));
        });

    }
}
