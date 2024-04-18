package _35_FinalExamPreparation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class _3_NeedforSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  nCars = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<Integer>> carsInfo = new LinkedHashMap<>();

        for (int i = 0; i < nCars ; i++) {
            String[] inf0  = scanner.nextLine().split("\\|");
            String car = inf0[0];

            List<Integer> values = carsInfo.computeIfAbsent(car, k -> new ArrayList<>());
            int mileage = Integer.parseInt(inf0[1]);
            int fuel = Integer.parseInt(inf0[2]);
            values.add(mileage);
            values.add(fuel);

            carsInfo.put(car,values);
        }

        while (true){
            String command = scanner.nextLine();
            if (command.equals("Stop")) {
                break;
            }

            String[]  parts = scanner.nextLine().split(" : ");
            String order = parts[0];
            String car = parts[1];

            switch (order){
                case "Drive":
                    int distance = Integer.parseInt(parts[2]);
                    int fuel = Integer.parseInt(parts[3]);
                    List<Integer>  newlistInfo = carsInfo.get(car);

                   // if (newlistInfo < f)

                    break;
                case "Refuel":
                    int fuel1 = Integer.parseInt(parts[2]);

                    break;
                case "Revert":
                    int km = Integer.parseInt(parts[2]);
                    int b =0 ;

                    break;
            }
        }




    }
}
