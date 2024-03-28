package Java_OOP.EXAM_Preparation._8_April_2023.robotService.entities.services;

public class MainService extends BaseService{
    private  static final int DEFAULT_CAPACITY = 30;


    protected MainService(String name) {
        super(name, DEFAULT_CAPACITY);
    }
}
