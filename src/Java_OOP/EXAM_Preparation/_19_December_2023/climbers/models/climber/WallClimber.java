package Java_OOP.EXAM_Preparation._19_December_2023.climbers.models.climber;

public class WallClimber extends BaseClimber{
    private static final double STRENGTH = 90;
    public WallClimber(String name) {
        super(name, STRENGTH);
    }

    @Override
    public void climb() {
        super.setStrength(Math.max(0, super.getStrength() - 30));
    }
}
