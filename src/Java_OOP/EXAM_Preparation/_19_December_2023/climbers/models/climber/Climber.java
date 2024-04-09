package Java_OOP.EXAM_Preparation._19_December_2023.climbers.models.climber;

import Java_OOP.EXAM_Preparation._19_December_2023.climbers.models.roster.Roster;

public interface Climber {
    String getName();

    double getStrength();

    boolean canClimb();

    Roster getRoster();


    void climb();
}
