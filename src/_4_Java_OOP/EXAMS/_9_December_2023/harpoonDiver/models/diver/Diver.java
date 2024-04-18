package _4_Java_OOP.EXAMS._9_December_2023.harpoonDiver.models.diver;

import _4_Java_OOP.EXAMS._9_December_2023.harpoonDiver.models.seaCatch.SeaCatch;

public interface Diver {
    String getName();

    double getOxygen();

    boolean canDive();

    SeaCatch getSeaCatch();

    void shoot();
}
