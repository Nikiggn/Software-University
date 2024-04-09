package Java_OOP.EXAM_Preparation._19_December_2023.climbers.models.climbing;

import Java_OOP.EXAM_Preparation._19_December_2023.climbers.models.climber.Climber;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers.models.mountain.Mountain;

import java.util.Collection;

public interface Climbing {
    void conqueringPeaks(Mountain mountain, Collection<Climber> climbers);

}
