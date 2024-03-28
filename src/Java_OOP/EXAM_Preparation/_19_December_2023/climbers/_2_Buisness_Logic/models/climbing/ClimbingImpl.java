package Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.models.climbing;

import Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.models.climber.Climber;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.models.mountain.Mountain;

import java.util.Collection;

public class ClimbingImpl implements Climbing {

    public ClimbingImpl(){

    }
    @Override
    public void conqueringPeaks(Mountain mountain, Collection<Climber> climbers) {
        Collection<String> peaks = mountain.getPeaksList();
        for (Climber climber : climbers) {
            while (climber.canClimb() && peaks.iterator().hasNext()) {
                climber.climb();
                String currentPeak = peaks.iterator().next();
                climber.getRoster().getPeaks().add(currentPeak);
                peaks.remove(currentPeak);
            }
        }
    }
}
