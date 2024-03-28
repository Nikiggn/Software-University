package Java_OOP.EXAM_Preparation._15_August_2023.handball.entities.gameplay;

public class Indoor extends BaseGameplay{
    private  static final int DEFAULT_CAPACITY = 250;

    protected Indoor(String name) {
        super(name, DEFAULT_CAPACITY);
    }
}
