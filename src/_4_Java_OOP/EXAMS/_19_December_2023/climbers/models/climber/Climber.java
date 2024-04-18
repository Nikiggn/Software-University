package _4_Java_OOP.EXAMS._19_December_2023.climbers.models.climber;

import _4_Java_OOP.EXAMS._19_December_2023.climbers.models.roster.Roster;

public interface Climber {
    String getName();

    double getStrength();

    boolean canClimb();

    Roster getRoster();


    void climb();
}
