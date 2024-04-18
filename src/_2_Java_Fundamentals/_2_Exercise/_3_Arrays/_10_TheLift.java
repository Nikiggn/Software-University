package _2_Java_Fundamentals._2_Exercise._3_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class _10_TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int peopleNow = people;

        int[] currentState = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();
        int[] wagons = new int[currentState.length];

        int possibleLenght = 4 * currentState.length;
        int diff = possibleLenght - people;

        for (int  i = 0;  i <currentState.length ;  i++) {
            int peopleInWagon = currentState[i];

            for (int j = peopleInWagon; j < 4; j++) {
                people -= 1;
                if (people == 0 ){
                    System.out.println("The lift has empty spots!");
                }
            }
        }
        for (int i = 0; i < currentState.length ; i++) {
            wagons[i] = 4;
        }

        if (possibleLenght >= peopleNow){
            wagons[currentState.length - 1] = 4 - diff;
            for (int el1: wagons) {
                System.out.print(el1 + " ");
            }
        }

        if (people > 0){
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
            for (int el2: wagons) {
                System.out.print(el2 + " ");
            }
        }
    }
}