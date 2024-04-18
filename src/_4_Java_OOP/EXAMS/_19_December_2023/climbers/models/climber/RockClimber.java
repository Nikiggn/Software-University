package _4_Java_OOP.EXAMS._19_December_2023.climbers.models.climber;

public class RockClimber extends BaseClimber{
    private static final double STRENGTH = 120;
    public RockClimber(String name) {
        super(name, STRENGTH);
    }

    @Override
    public void climb() {
        super.setStrength(Math.max(0, super.getStrength() - 60));
    }
}
