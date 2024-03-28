package Java_OOP.EXAM_Preparation._18_April_2022.zoo.entities.foods;

public class Vegetable extends BaseFood{

    private static final int DEFAULT_CALORIES = 50;
    private static final double DEFAULT_PRICE = 5;

    protected Vegetable() {
        super(DEFAULT_CALORIES, DEFAULT_PRICE);
    }


}
