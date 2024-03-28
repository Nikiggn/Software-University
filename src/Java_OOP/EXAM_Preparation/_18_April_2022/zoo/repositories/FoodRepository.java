package Java_OOP.EXAM_Preparation._18_April_2022.zoo.repositories;

import Java_OOP.EXAM_Preparation._18_April_2022.zoo.entities.foods.Food;

public interface FoodRepository {
    void add(Food food);

    boolean remove(Food food);

    Food findByType(String type);
}
