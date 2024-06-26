package _4_Java_OOP.EXAMS._18_April_2022.zoo.repositories;

import _4_Java_OOP.EXAMS._18_April_2022.zoo.entities.foods.Food;

import java.util.ArrayList;
import java.util.Collection;

public class FoodRepositoryImpl implements FoodRepository {
    private Collection<Food> foods;

    public FoodRepositoryImpl() {
        this.foods = new ArrayList<>();

    }

    @Override
    public void add(Food food) {
        this.foods.add(food);
    }

    @Override
    public boolean remove(Food food) {
        return this.foods.remove(food);
    }

    @Override
    public Food findByType(String type) {
        for (Food food: foods) {
            if (food.getClass().getSimpleName().equals(type)){
                return food;
            }
        }
        return null;
    }
}
