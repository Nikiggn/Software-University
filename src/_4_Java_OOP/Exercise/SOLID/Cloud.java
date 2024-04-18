package _4_Java_OOP.Exercise.SOLID;

import _4_Java_OOP.Exercise.SOLID.Interfaces.Food;

public class Cloud implements Food {
    @Override
    public double amountOfFood() {
        return 0;
    }

    @Override
    public double amountOfCalories() {
        return 0;
    }
}
