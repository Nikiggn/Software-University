package Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.models.climber;

public class WallClimber extends BaseClimber {

    private static final double DEFAULT_STRENGTH = 90;

    public WallClimber(String name) {
        super(name, DEFAULT_STRENGTH);
    }

    @Override
    public void climb() {
        setStrength(getStrength() - 30);
        if (getStrength() < 0){
            setStrength(0);
        }
    }
}
