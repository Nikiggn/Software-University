package _4_Java_OOP.EXAMS._14_August_2022.football.entities.supplement;

public class Liquid extends BaseSupplement{
    private static final int DEFAULT_ENERGY = 90;
    private static final int DEFAULT_PRICE = 25;
    protected Liquid() {
        super(DEFAULT_ENERGY, DEFAULT_PRICE);
    }
}
