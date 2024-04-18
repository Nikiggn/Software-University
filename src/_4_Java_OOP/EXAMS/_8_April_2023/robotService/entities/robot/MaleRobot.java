package _4_Java_OOP.EXAMS._8_April_2023.robotService.entities.robot;

public class MaleRobot extends BaseRobot{
    private  static final int DEFAULT_KILOS = 9;

    protected MaleRobot(String name, String kind, double price) {
        super(name, kind, DEFAULT_KILOS, price);
    }

    @Override
    public void eating() {
        setKilograms(getKilograms() + 3);
    }
}
