package Java_OOP.EXAM_Preparation._15_August_2023.handball.entities.equipment;

public class Kneepad extends BaseEquipment{
    private  static final int DEFAULT_PROTECTION = 120;
    private  static final int DEFAULT_PRICE = 15;

    public Kneepad() {
        super(DEFAULT_PROTECTION, DEFAULT_PRICE);
    }
}
