package Java_OOP.Exercise.WorkingwithAbstraction.CardswithPower;

public class Card {
    private CardRank rankPower;
    private CardSuit suitPower;


    public Card(CardRank rankPower, CardSuit suitPower) {
        this.rankPower = rankPower;
        this.suitPower = suitPower;
    }

    public int getPower() {
        return rankPower.getPower() + suitPower.getPower();
    }

    public void print() {


        System.out.printf("Card name: %s of %s; Card power: %d"
                , rankPower
                , suitPower
                , getPower());
    }


}
