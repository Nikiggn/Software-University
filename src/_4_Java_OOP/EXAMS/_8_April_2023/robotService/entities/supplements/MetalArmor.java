package _4_Java_OOP.EXAMS._8_April_2023.robotService.entities.supplements;

public class MetalArmor extends BaseSupplement{
    private  static final int DEFAULT_HARDNESS = 5;
    private  static final double DEFAULT_PRICE = 15;

    protected MetalArmor() {
        super(DEFAULT_HARDNESS, DEFAULT_PRICE);
    }
}
