package _4_Java_OOP.Exercise.Inheritance.animals;

public class Kitten extends Cat{
    private static final String GENDER = "Female";

    public Kitten(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound() {
        return String.format("Meow");
    }
}
