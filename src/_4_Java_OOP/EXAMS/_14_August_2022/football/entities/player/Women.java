package _4_Java_OOP.EXAMS._14_August_2022.football.entities.player;

public class Women extends BasePlayer{
    private static final double DEFAULT_KILOGRAMS = 60;
    private static final int INCREASE_STRENGTH = 115;


    protected Women(String name, String nationality, int strength) {
        super(name, nationality, DEFAULT_KILOGRAMS, strength);
    }

    @Override
    public void stimulation() {
        setStrength(getStrength() + INCREASE_STRENGTH);
    }
}
