package Java_OOP.EXAM_Preparation._15_August_2023.handball.entities.gameplay;

public class Outdoor extends BaseGameplay{
    private  static final int DEFAULT_CAPACITY = 150;

    protected Outdoor(String name) {
        super(name, DEFAULT_CAPACITY);
    }
}
