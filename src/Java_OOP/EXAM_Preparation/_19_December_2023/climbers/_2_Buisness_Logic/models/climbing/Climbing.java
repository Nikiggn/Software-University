package Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.models.climbing;

import Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.models.climber.Climber;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.models.mountain.Mountain;

import java.util.Collection;

public interface Climbing {
    void conqueringPeaks(Mountain mountain, Collection<Climber> climbers);

}
