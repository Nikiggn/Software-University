package Java_OOP.EXAM_Preparation._14_August_2022.football.entities.player;

public class Men extends BasePlayer{

    private static final double DEFAULT_KILOGRAMS = 85.5;
    private static final int INCREASE_STRENGTH = 145;

    protected Men(String name, String nationality, int strength) {
        super(name, nationality, DEFAULT_KILOGRAMS, strength);
    }

    @Override
    public void stimulation() {
        setStrength(getStrength() + INCREASE_STRENGTH);
    }
}
