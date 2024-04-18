package _4_Java_OOP.EXAMS.dolphinarium.entities.pools;

public class ShallowWaterPool extends BasePool{
    private static final int CAPACITY = 2;
    public ShallowWaterPool(String name) {
        super(name, CAPACITY);
    }
}
