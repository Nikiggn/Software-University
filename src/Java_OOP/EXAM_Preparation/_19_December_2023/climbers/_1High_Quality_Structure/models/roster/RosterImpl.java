package Java_OOP.EXAM_Preparation._19_December_2023.climbers._1High_Quality_Structure.models.roster;

import java.util.ArrayList;
import java.util.Collection;

public class RosterImpl implements  Roster{
    private  Collection<String> peaks;

    public RosterImpl() {
        this.peaks = new ArrayList<>();
    }

    @Override
    public Collection<String> getPeaks() {
        return this.peaks;
    }
}
