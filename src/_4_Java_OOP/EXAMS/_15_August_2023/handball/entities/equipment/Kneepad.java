package _4_Java_OOP.EXAMS._15_August_2023.handball.entities.equipment;

public class Kneepad extends BaseEquipment{
    private  static final int DEFAULT_PROTECTION = 120;
    private  static final int DEFAULT_PRICE = 15;

    public Kneepad() {
        super(DEFAULT_PROTECTION, DEFAULT_PRICE);
    }
}
