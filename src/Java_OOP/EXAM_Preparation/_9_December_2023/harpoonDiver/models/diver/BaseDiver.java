package Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.models.diver;

import Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.models.seaCatch.BaseSeaCatch;
import Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.models.seaCatch.SeaCatch;

import static Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.common.ExceptionMessages.DIVER_NAME_NULL_OR_EMPTY;
import static Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.common.ExceptionMessages.DIVER_OXYGEN_LESS_THAN_ZERO;

public abstract class BaseDiver implements Diver{
    private String name;
    private double oxygen;
    private SeaCatch seaCatch;

    protected BaseDiver(String name, double oxygen) {
        this.setName(name);
        this.setOxygen(oxygen);
        this.seaCatch = new BaseSeaCatch();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getOxygen() {
        return this.oxygen;
    }

    @Override
    public boolean canDive() {
        return this.oxygen > 0;
    }

    @Override
    public SeaCatch getSeaCatch() {
        return this.seaCatch;
    }

    @Override
    public  void shoot() {
        this.oxygen = Math.max(0, this.oxygen - 30);

    }


    private void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new NullPointerException(DIVER_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    private void setOxygen(double oxygen) {
        if (oxygen < 0){
            throw new IllegalArgumentException(DIVER_OXYGEN_LESS_THAN_ZERO);
        }

        this.oxygen = oxygen;
    }
}
