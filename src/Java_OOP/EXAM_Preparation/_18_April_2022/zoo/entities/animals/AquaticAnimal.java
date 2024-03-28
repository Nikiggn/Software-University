package Java_OOP.EXAM_Preparation._18_April_2022.zoo.entities.animals;

public class AquaticAnimal extends BaseAnimal{

    private static final double DEFAULT_KILOGRAMS = 2.5;

    protected AquaticAnimal(String name, String kind, double price) {
        super(name, kind, DEFAULT_KILOGRAMS, price);
    }

    @Override
    public void eat() {
        setKg(getKg() + 7.5);
    }
}
