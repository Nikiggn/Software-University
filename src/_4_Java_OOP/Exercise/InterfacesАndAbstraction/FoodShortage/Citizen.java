package _4_Java_OOP.Exercise.InterfacesАndAbstraction.FoodShortage;

public class Citizen implements Buyer, Identifiable, Person, Birthable {
    private String name;
    private int age;
    private String id;
    private String BirthDate;
    private int food;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.BirthDate = birthDate;
        this.food = 0;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getBirthDate() {
        return this.BirthDate;
    }
}
