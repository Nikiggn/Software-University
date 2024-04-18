package _4_Java_OOP.EXAMS.dolphinarium.entities.dolphins;

//TODO Implement all methods


import _4_Java_OOP.EXAMS.dolphinarium.entities.foods.Food;

public interface Dolphin {
    String getName();
    int getEnergy();

    void jump();

    void eat(Food food);
}
