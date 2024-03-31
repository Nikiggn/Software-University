package Java_OOP.EXAM_Preparation._15_August_2023.handball.entities.equipment;

public class ElbowPad extends BaseEquipment{
    private  static final int DEFAULT_PROTECTION = 90;
    private  static final int DEFAULT_PRICE = 25;

    public ElbowPad() {
        super(DEFAULT_PROTECTION, DEFAULT_PRICE);
    }
}
