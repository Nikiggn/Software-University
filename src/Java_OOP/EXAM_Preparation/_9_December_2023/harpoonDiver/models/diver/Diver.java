package Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.models.diver;

import Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.models.seaCatch.SeaCatch;

public interface Diver {
    String getName();

    double getOxygen();

    boolean canDive();

    SeaCatch getSeaCatch();

    void shoot();
}
