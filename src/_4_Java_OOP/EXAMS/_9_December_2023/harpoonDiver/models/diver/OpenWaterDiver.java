package _4_Java_OOP.EXAMS._9_December_2023.harpoonDiver.models.diver;

public class OpenWaterDiver extends BaseDiver{
    private static final double DEFAULT_OXYGEN = 30;

    public OpenWaterDiver(String name) {
        super(name, DEFAULT_OXYGEN);
    }
}
