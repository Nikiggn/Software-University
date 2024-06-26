package _4_Java_OOP.EXAMS._18_April_2022.zoo.entities.foods;

public abstract class BaseFood implements Food{
    private int calories;
    private double price;

    protected BaseFood(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getCalories() {
        return calories;
    }
}
