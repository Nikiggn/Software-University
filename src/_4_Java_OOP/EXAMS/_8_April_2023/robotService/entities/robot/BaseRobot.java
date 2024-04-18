package _4_Java_OOP.EXAMS._8_April_2023.robotService.entities.robot;

import static _4_Java_OOP.EXAMS._8_April_2023.robotService.common.ExceptionMessages.*;

public abstract  class BaseRobot implements Robot{
    private String name;
    private String kind;
    private int kilograms;
    private double price;

    protected BaseRobot(String name, String kind, int kilograms, double price) {
        this.setName(name);
        this.setKind(kind);
        this.kilograms = kilograms;
        this.setPrice(price);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        if (name == null || name.trim().length() < 1){
            throw new NullPointerException(ROBOT_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public int getKilograms() {
        return this.kilograms;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public abstract void eating();

    public void setKind(String kind) {
        if (kind == null || kind.trim().length() < 1){
            throw new NullPointerException(ROBOT_KIND_CANNOT_BE_NULL_OR_EMPTY);
        }
        this.kind = kind;
    }

    public void setPrice(double price) {
        if (price <= 0){
            throw  new IllegalArgumentException(ROBOT_PRICE_CANNOT_BE_BELOW_OR_EQUAL_TO_ZERO);
        }
        this.price = price;
    }
    public void setKilograms(int kilograms) {
        this.kilograms = kilograms;
    }
}
