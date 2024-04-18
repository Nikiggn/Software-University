package _4_Java_OOP.EXAMS._8_April_2023.robotService.entities.supplements;

public class PlasticArmor extends BaseSupplement{
    private  static final int DEFAULT_HARDNESS = 1;
    private  static final double DEFAULT_PRICE = 10;

    protected PlasticArmor() {
        super(DEFAULT_HARDNESS, DEFAULT_PRICE);
    }
}
