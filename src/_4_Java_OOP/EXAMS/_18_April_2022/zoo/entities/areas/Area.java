package _4_Java_OOP.EXAMS._18_April_2022.zoo.entities.areas;

import _4_Java_OOP.EXAMS._18_April_2022.zoo.entities.animals.Animal;
import _4_Java_OOP.EXAMS._18_April_2022.zoo.entities.foods.Food;

import java.util.Collection;

public interface Area {
    String getName();

    Collection<Animal> getAnimals();

    Collection<Food> getFoods();

    int sumCalories();

    void addAnimal(Animal animal);

    void removeAnimal(Animal animal);

    void addFood(Food food);

    void feed();

    String getInfo();
}
