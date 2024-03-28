package Java_OOP.EXAM_Preparation._18_April_2022.zoo.entities.animals;

import static Java_OOP.EXAM_Preparation._18_April_2022.zoo.common.ExceptionMessages.*;

public abstract  class BaseAnimal implements Animal {

    private String name;
    private String kind;
    private double kg;
    private double price;

    protected BaseAnimal(String name, String kind, double kg, double price) {
        this.setName(name);
        this.setKind(kind);
        this.kg = kg;
        this.setPrice(price);
    }

    @Override
    public abstract void eat();

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getKg() {
        return this.kg;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
    public void setKg(Double kg){
        this.kg = kg;
    }

    private void setName(String name) {
        if (name == null || name.trim().length() < 1){
            throw new NullPointerException(ANIMAL_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    private void setKind(String kind) {
        if (kind == null || kind.trim().length() < 1){
            throw new NullPointerException(ANIMAL_KIND_NULL_OR_EMPTY);
        }
        this.kind = kind;
    }

    private void setPrice(double price) {
        if (price<=0){
            throw new IllegalArgumentException(ANIMAL_PRICE_BELOW_OR_EQUAL_ZERO);
        }
        this.price = price;
    }
}
