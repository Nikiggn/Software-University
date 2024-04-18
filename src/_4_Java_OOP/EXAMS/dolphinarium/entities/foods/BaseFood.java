package _4_Java_OOP.EXAMS.dolphinarium.entities.foods;

public abstract class BaseFood implements Food{

    private int calories;

    protected BaseFood(int calories) {
        this.calories = calories;
    }

    @Override
    public int getCalories() {
        return this.calories;
    }
}
