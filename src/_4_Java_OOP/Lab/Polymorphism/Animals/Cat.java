package _4_Java_OOP.Lab.Polymorphism.Animals;

public class Cat extends  Animal{

    public static final String SOUND = "MEEOW";

    protected Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }
}
