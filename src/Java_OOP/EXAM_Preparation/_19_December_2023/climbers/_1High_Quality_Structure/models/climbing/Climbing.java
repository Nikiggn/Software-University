package Java_OOP.EXAM_Preparation._19_December_2023.climbers._1High_Quality_Structure.models.climbing;

import Java_OOP.EXAM_Preparation._19_December_2023.climbers._1High_Quality_Structure.models.climber.Climber;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers._1High_Quality_Structure.models.mountain.Mountain;

import java.util.Collection;

public interface Climbing {
    void conqueringPeaks(Mountain mountain, Collection<Climber> climbers);

}
