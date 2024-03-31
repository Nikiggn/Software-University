package Java_OOP.EXAM_Preparation._15_August_2023.handball.entities.team;

public class Germany extends BaseTeam{
    public Germany(String name, String country, int advantage) {
        super(name, country, advantage);
    }

    @Override
    public void play() {
        int adv = super.getAdvantage() + 145;
        setAdvantage(adv);
    }
}
