package Java_OOP.EXAM_Preparation._8_April_2023.robotService.entities.services;

public class SecondaryService extends BaseService{

    private  static final int DEFAULT_CAPACITY = 15;

    protected SecondaryService(String name) {
        super(name, DEFAULT_CAPACITY);
    }
}
