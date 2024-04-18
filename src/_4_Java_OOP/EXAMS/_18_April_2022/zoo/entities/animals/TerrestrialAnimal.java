package _4_Java_OOP.EXAMS._18_April_2022.zoo.entities.animals;

public class TerrestrialAnimal extends BaseAnimal {

    private static final double DEFAULT_KILOGRAMS = 5.5;

    protected TerrestrialAnimal(String name, String kind, double price) {
        super(name, kind, DEFAULT_KILOGRAMS, price);
    }

    @Override
    public void eat() {
        setKg(getKg() + 5.7);
    }
}
