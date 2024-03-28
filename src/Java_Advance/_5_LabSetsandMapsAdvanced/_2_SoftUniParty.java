package Java_Advance._5_LabSetsandMapsAdvanced;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _2_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> guestList = new TreeSet<>();

        while (true){
            String guests = scanner.nextLine();
            if (guests.equals("PARTY")){
                break;
            }
            guestList.add(guests);
        }

        while (true){
            String guests = scanner.nextLine();
            if (guests.equals("END")){
                break;
            }
            guestList.remove(guests);
        }

        System.out.println(guestList.size());
        for (String el : guestList) {
            System.out.println(el);
        }
    }
}
