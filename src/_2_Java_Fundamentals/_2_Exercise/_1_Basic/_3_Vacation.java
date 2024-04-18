package _2_Java_Fundamentals._2_Exercise._1_Basic;

import java.util.Scanner;

public class _3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        switch (day){
            case "Friday":
                if (type.equals("Students_04_")){
                    price = 8.45;
                } else if (type.equals("Business")) {
                    price = 10.9;
                }else if (type.equals("Regular")){
                    price = 15;
                }
            case "Saturday":
                if (type.equals("Students_04_")){
                    price = 9.8;
                } else if (type.equals("Business")) {
                    price = 15.6;
                }else {
                    price = 20;
                }
            case "Sunday":
                if (type.equals("Students_04_")){
                    price = 10.46;
                } else if (type.equals("Business")) {
                    price = 16;
                }else if (type.equals("Regular")){
                    price = 22.5;
                }

        }

        double totalPrice = price * people;

        if (people >= 30 && type.equals("Students_04_")){
            totalPrice = totalPrice * 0.85;
        }

        if (type.equals("Business") && people >= 100){
            people = people - 10;
            totalPrice = people * price;
        }

        if (type.equals("Regular")&& people >= 10 && people <= 20){
            totalPrice = totalPrice * 0.95;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
