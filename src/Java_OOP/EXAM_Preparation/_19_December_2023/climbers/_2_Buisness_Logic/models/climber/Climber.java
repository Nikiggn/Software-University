package Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.models.climber;

import Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.models.roster.Roster;

public interface Climber {
    String getName();

    double getStrength();

    boolean canClimb();

    Roster getRoster();


    void climb();
}
