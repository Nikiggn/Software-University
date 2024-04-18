package _4_Java_OOP.EXAMS._19_December_2023.climbers.models.climber;

import _4_Java_OOP.EXAMS._19_December_2023.climbers.models.roster.Roster;
import _4_Java_OOP.EXAMS._19_December_2023.climbers.models.roster.RosterImpl;

import static _4_Java_OOP.EXAMS._19_December_2023.climbers.common.ExceptionMessages.CLIMBER_NAME_NULL_OR_EMPTY;
import static _4_Java_OOP.EXAMS._19_December_2023.climbers.common.ExceptionMessages.CLIMBER_STRENGTH_LESS_THAN_ZERO;

public abstract class BaseClimber implements Climber{
    private String name;
    private double strength;
    private Roster roster;

    protected BaseClimber(String name, double strength) {
        this.setName(name);
        this.setStrength(strength);
        this.roster = new RosterImpl();
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getStrength() {
        return this.strength;
    }

    @Override
    public boolean canClimb() {
        return this.strength > 0;
    }

    @Override
    public Roster getRoster() {
        return this.roster;
    }

    @Override
    public abstract void climb();

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new NullPointerException(CLIMBER_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    public void setStrength(double strength) {
        if (strength < 0){
            throw  new IllegalArgumentException(CLIMBER_STRENGTH_LESS_THAN_ZERO);
        }
        this.strength = strength;
    }
}
