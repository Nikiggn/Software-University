package Java_OOP.EXAM_Preparation._19_December_2023.climbers._1High_Quality_Structure.models.climber;


import Java_OOP.EXAM_Preparation._19_December_2023.climbers._1High_Quality_Structure.models.roster.Roster;

import static Java_OOP.EXAM_Preparation._19_December_2023.climbers._1High_Quality_Structure.common.ExceptionMessages.CLIMBER_NAME_NULL_OR_EMPTY;
import static Java_OOP.EXAM_Preparation._19_December_2023.climbers._1High_Quality_Structure.common.ExceptionMessages.CLIMBER_STRENGTH_LESS_THAN_ZERO;

public abstract  class BaseClimber implements  Climber {
    private String name;
    private double strength;
    private Roster roster;

    protected BaseClimber(String name, double strength) {
        this.setName(name);
        this.setStrength(strength);
    }

    @Override
    public abstract void climb();

    @Override
    public boolean canClimb() {
        return this.strength > 0;
    }

    @Override
    public Roster getRoster() {
        return roster;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getStrength() {
        return strength;
    }

    private void setName(String name) {
        if (name == null || name.trim().length() < 1){
            throw  new NullPointerException(CLIMBER_NAME_NULL_OR_EMPTY);
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