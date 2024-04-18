package _4_Java_OOP.EXAMS._14_August_2022.football.entities.supplement;

public abstract class BaseSupplement implements Supplement {
    private int energy;
    private double price;

    protected BaseSupplement(int energy, double price) {
        this.energy = energy;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getEnergy() {
        return energy;
    }
}
