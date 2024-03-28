package Java_OOP.EXAM_Preparation._14_August_2022.football.entities.player;

import static Java_OOP.EXAM_Preparation._14_August_2022.football.common.ExceptionMessages.*;

public abstract class BasePlayer implements Player{
    private String name;
    private String nationality;
    private double kg;
    private int strength;


    protected BasePlayer(String name, String nationality, double kg, int strength) {
        this.setName(name);
        this.setNationality(nationality);
        this.kg = kg;
        this.setStrength(strength);
    }

    @Override
    public void stimulation() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getKg() {
        return kg;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public void setName(String name) {
        if (name == null || name.trim().length() < 1){
            throw new NullPointerException(PLAYER_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    private void setNationality(String nationality) {
        if (nationality == null || nationality.trim().length() < 1){
            throw new NullPointerException(PLAYER_NATIONALITY_NULL_OR_EMPTY);
        }
        this.nationality = nationality;
    }

    public void setStrength(int strength) {
        if (strength <= 0){
            throw new IllegalArgumentException(PLAYER_STRENGTH_BELOW_OR_EQUAL_ZERO);
        }
        this.strength = strength;
    }
}
