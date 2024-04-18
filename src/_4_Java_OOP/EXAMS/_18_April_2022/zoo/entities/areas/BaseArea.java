package _4_Java_OOP.EXAMS._18_April_2022.zoo.entities.areas;

import _4_Java_OOP.EXAMS._18_April_2022.zoo.entities.animals.Animal;
import _4_Java_OOP.EXAMS._18_April_2022.zoo.entities.foods.Food;

import java.util.Collection;

import static _4_Java_OOP.EXAMS._18_April_2022.zoo.common.ExceptionMessages.*;

public  abstract class BaseArea implements Area{
    private String name;
    private int capacity;
    private Collection<Food> foods;
    private Collection<Animal> animals;

    protected BaseArea(String name, int capacity) {
        this.setName(name);
        this.capacity = capacity;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Collection<Animal> getAnimals() {
        return this.animals;
    }

    @Override
    public Collection<Food> getFoods() {
        return this.foods;
    }

    @Override
    public int sumCalories() {
        return foods.stream().mapToInt(Food::getCalories).sum();
    }

    @Override
    public void addAnimal(Animal animal) {
        if (this.animals.size() >= capacity){
            throw  new IllegalArgumentException(NOT_ENOUGH_CAPACITY);
        }
        this.animals.add(animal);
    }

    @Override
    public void removeAnimal(Animal animal) {
        this.animals.remove(animal);
    }

    @Override
    public void addFood(Food food) {
        this.foods.add(food);
    }

    @Override
    public void feed() {
        this.animals.forEach(animal -> feed());
    }

    @Override
    public String getInfo() {
        StringBuilder res = new StringBuilder();
        return null;
    }

    private void setName(String name) {
        if (name == null || name.trim().length() < 1){
            throw new NullPointerException(AREA_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }
}
