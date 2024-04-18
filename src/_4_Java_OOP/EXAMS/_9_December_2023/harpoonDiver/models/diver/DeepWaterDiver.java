package _4_Java_OOP.EXAMS._9_December_2023.harpoonDiver.models.diver;

public class DeepWaterDiver extends BaseDiver{
    private static final double DEFAULT_OXYGEN = 90;

    public DeepWaterDiver(String name) {
        super(name, DEFAULT_OXYGEN);
    }
}
