package _4_Java_OOP.Exercise.InterfacesАndAbstraction.FoodShortage;

public class Rebel implements Buyer,Person{
    private String name;
    private int age;
    private String group;

    private int food;


    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    @Override
    public void buyFood() {

    }

    @Override
    public int getFood() {
        return this.food;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    public String getGroup() {
        return this.group;
    }

}
