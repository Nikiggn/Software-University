package _4_Java_OOP.EXAMS._14_August_2022.football.entities.supplement;

public class Powdered extends BaseSupplement{
    private static final int DEFAULT_ENERGY = 120;
    private static final int DEFAULT_PRICE = 15;

    protected Powdered() {
        super(DEFAULT_ENERGY, DEFAULT_PRICE);
    }
}
