package _4_Java_OOP.EXAMS._9_December_2023.harpoonDiver.models.diver;

public class WreckDiver extends BaseDiver{
    private static final double DEFAULT_OXYGEN = 150;

    public WreckDiver(String name) {
        super(name, DEFAULT_OXYGEN);
    }
}
