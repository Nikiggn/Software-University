package _4_Java_OOP.EXAMS._18_April_2022.zoo.repositories;

import _4_Java_OOP.EXAMS._18_April_2022.zoo.entities.foods.Food;

public interface FoodRepository {
    void add(Food food);

    boolean remove(Food food);

    Food findByType(String type);
}
