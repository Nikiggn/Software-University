package _4_Java_OOP.EXAMS._8_April_2023.robotService.entities.robot;

public class FemaleRobot extends BaseRobot{
    private  static final int DEFAULT_KILOS = 7;

    protected FemaleRobot(String name, String kind, double price) {
        super(name, kind, DEFAULT_KILOS, price);
    }

    @Override
    public void eating() {
        setKilograms(getKilograms() + 1);
    }
}
