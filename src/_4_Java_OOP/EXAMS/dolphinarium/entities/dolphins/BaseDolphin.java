package _4_Java_OOP.EXAMS.dolphinarium.entities.dolphins;

import _4_Java_OOP.EXAMS.dolphinarium.entities.foods.Food;

import static _4_Java_OOP.EXAMS.dolphinarium.common.ExceptionMessages.DOLPHIN_NAME_NULL_OR_EMPTY;

public abstract class BaseDolphin implements Dolphin {

    private String name;
    private int energy;

    protected BaseDolphin(String name, int energy) {
        this.setName(name);
        this.setEnergy(energy);
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getEnergy() {
        return this.energy;
    }

    @Override
    public abstract void jump();


    @Override
    public void eat(Food food) {
        String type = food.getClass().getSimpleName();
        if (type.equals("Squid ")) {
            this.energy += 175;
        } else if (type.equals("Herring")) {
            this.energy += 200;
        } else if (type.equals("Mackerel")) {
            this.energy += 305;
        }
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(DOLPHIN_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    public void setEnergy(int energy) {
        if (energy < 0) {
            this.energy = 0;
        } else {
            this.energy = energy;
        }
    }
}
