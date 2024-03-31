package Java_OOP.EXAM_Preparation._15_August_2023.handball.entities.team;

public class Bulgaria extends BaseTeam{


    public Bulgaria(String name, String country, int advantage) {
        super(name, country, advantage);
    }

    @Override
    public void play() {
        int adv = super.getAdvantage() + 115;
        setAdvantage(adv);
    }
}
