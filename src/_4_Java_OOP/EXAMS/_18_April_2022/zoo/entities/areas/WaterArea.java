package _4_Java_OOP.EXAMS._18_April_2022.zoo.entities.areas;

public class WaterArea extends BaseArea {

    private static final int DEFAULT_CAPACITY = 10;

    protected WaterArea(String name) {
        super(name, DEFAULT_CAPACITY);
    }
}
