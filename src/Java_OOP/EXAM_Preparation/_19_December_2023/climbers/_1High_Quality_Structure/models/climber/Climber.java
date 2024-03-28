package Java_OOP.EXAM_Preparation._19_December_2023.climbers._1High_Quality_Structure.models.climber;

import Java_OOP.EXAM_Preparation._19_December_2023.climbers._1High_Quality_Structure.models.roster.Roster;

public interface Climber {
    String getName();

    double getStrength();

    boolean canClimb();

    Roster getRoster();


    void climb();
}
