package _4_Java_OOP.Exercise.WorkingwithAbstraction.CardSuits;

public enum Card_Suits {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES;
    public  static void printSuits(){
        System.out.println("Card Suits:");
        for (Card_Suits cardSuits: Card_Suits.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s\n", cardSuits.ordinal(), cardSuits);
        }
    }


}
