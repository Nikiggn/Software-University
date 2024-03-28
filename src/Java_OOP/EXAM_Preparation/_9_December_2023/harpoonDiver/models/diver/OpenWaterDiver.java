package Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.models.diver;

public class OpenWaterDiver extends BaseDiver{
    private static final double DEFAULT_OXYGEN = 30;

    protected OpenWaterDiver(String name) {
        super(name, DEFAULT_OXYGEN);
    }
}
