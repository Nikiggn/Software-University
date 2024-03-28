package Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.models.mountain;

import java.util.ArrayList;
import java.util.Collection;

import static Java_OOP.EXAM_Preparation._19_December_2023.climbers._1High_Quality_Structure.common.ExceptionMessages.MOUNTAIN_NAME_NULL_OR_EMPTY;

public class MountainImpl implements Mountain {
    private String name;
    private Collection<String> peakList;

    public MountainImpl(String name) {
        this.name = name;
        this.peakList = new ArrayList<>();
    }

    @Override
    public Collection<String> getPeaksList() {
        return this.peakList;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.trim().length() < 1){
            throw new NullPointerException(MOUNTAIN_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }
}
