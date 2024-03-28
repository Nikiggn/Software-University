package Java_OOP.EXAM_Preparation._15_August_2023.handball.entities.team;

public class Bulgaria extends BaseTeam{


    protected Bulgaria(String name, String country, int advantage) {
        super(name, country, advantage);
    }

    @Override
    public void play() {
        setAdvantage(getAdvantage() + 115);
    }
}
