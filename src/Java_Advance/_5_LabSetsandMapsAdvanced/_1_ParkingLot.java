package Java_Advance._5_LabSetsandMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _1_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parkingLot = new LinkedHashSet<>();
        while (true){
            String input = scanner.nextLine();
            if (input.equals("END")){
                break;
            }
            String direction = input.split(", ")[0];
            String carNumber = input.split(", ")[1];
            switch (direction){
                case "IN":
                    parkingLot.add(carNumber);
                    break;
                case "OUT":
                    parkingLot.remove(carNumber);
                    break;
            }
        }
        if (parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String el : parkingLot) {
                System.out.println(el);
            }
        }

    }
}
