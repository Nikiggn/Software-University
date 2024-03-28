package Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.models.diver;

public class DeepWaterDiver extends BaseDiver{
    private static final double DEFAULT_OXYGEN = 90;

    protected DeepWaterDiver(String name) {
        super(name, DEFAULT_OXYGEN);
    }
}
