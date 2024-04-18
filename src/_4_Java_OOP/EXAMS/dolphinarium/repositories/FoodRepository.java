package _4_Java_OOP.EXAMS.dolphinarium.repositories;

import _4_Java_OOP.EXAMS.dolphinarium.entities.foods.Food;
public interface FoodRepository {
    void add(Food food);

    boolean remove(Food food);

    Food findByType(String type);
}
