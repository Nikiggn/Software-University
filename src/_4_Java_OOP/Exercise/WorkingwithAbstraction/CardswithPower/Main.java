package _4_Java_OOP.Exercise.WorkingwithAbstraction.CardswithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rank  = scanner.nextLine();
        String suit = scanner.nextLine();

        CardRank cardRankEnum = CardRank.valueOf(rank);
        CardSuit cardSuitEnum = CardSuit.valueOf(suit);
        Card card = new Card(cardRankEnum, cardSuitEnum);
        card.print();

    }
}
