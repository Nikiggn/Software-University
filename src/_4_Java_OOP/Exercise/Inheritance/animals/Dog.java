package _4_Java_OOP.Exercise.Inheritance.animals;

public class Dog extends Animal{
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return String.format("Woof!");
    }
}
