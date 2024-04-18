package _4_Java_OOP.EXAMS._19_December_2023.climbers.models.climbing;

import _4_Java_OOP.EXAMS._19_December_2023.climbers.models.climber.Climber;
import _4_Java_OOP.EXAMS._19_December_2023.climbers.models.mountain.Mountain;

import java.util.Collection;

public interface Climbing {
    void conqueringPeaks(Mountain mountain, Collection<Climber> climbers);

}
