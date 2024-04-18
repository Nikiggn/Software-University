package _4_Java_OOP.EXAMS.dolphinarium.entities.pools;

import _4_Java_OOP.EXAMS.dolphinarium.entities.dolphins.Dolphin;
import _4_Java_OOP.EXAMS.dolphinarium.entities.foods.Food;

import java.util.ArrayList;
import java.util.Collection;

import static _4_Java_OOP.EXAMS.dolphinarium.common.ExceptionMessages.*;

public abstract class BasePool implements Pool{

    private String name;
    private int capacity;
    private Collection<Food> foods;
    private Collection<Dolphin> dolphins;

    protected BasePool(String name, int capacity) {
        this.setName(name);
        this.capacity = capacity;
        this.foods = new ArrayList<>();
        this.dolphins = new ArrayList<>();
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public Collection<Dolphin> getDolphins() {
        return this.dolphins;
    }

    @Override
    public Collection<Food> getFoods() {
        return this.foods;
    }

    @Override
    public void addDolphin(Dolphin dolphin) {
        if (this.dolphins.size() >= this.capacity){
            throw new IllegalStateException(NOT_ENOUGH_CAPACITY);
        }

        if (dolphin.getEnergy() <= 0 ){
            throw new IllegalArgumentException(DOLPHIN_ENERGY_BELOW_OR_EQUAL_ZERO);
        }

        this.dolphins.add(dolphin);
    }

    @Override
    public void removeDolphin(Dolphin dolphin) {
        this.dolphins.remove(dolphin);
    }

    @Override
    public void addFood(Food food) {
        this.foods.add(food);
    }

    public void setName(String name){
        if (name == null || name.trim().isEmpty()){
            throw new NullPointerException(POOL_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }
}
