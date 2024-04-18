package _2_Java_Fundamentals._2_Exercise._2_Data_Types_and_Variables;

import java.util.Scanner;

public class _3_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeople = Integer.parseInt(scanner.nextLine());
        int peoplePerElevator = Integer.parseInt(scanner.nextLine());

        int Fullcourses = (int) Math.ceil((double) numPeople / peoplePerElevator);
        System.out.println(Fullcourses);
    }
}
