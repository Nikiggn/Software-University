package Java_OOP.EXAM_Preparation._19_December_2023.climbers._1High_Quality_Structure.models.climber;

public class RockClimber extends BaseClimber{

    private static final double DEFAULT_STRENGTH = 120;

    protected RockClimber(String name) {
        super(name, DEFAULT_STRENGTH);
    }

    @Override
    public void climb() {
        setStrength(getStrength() - 60);
        if (getStrength() < 0){
            setStrength(0);
        }

    }
}
