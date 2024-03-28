package Java_OOP.EXAM_Preparation._18_April_2022.zoo.entities.areas;

public class LandArea extends BaseArea{

    private static final int DEFAULT_CAPACITY = 25;

    protected LandArea(String name) {
        super(name, DEFAULT_CAPACITY);
    }
}
