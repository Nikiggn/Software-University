package Java_OOP.Exercise.SOLID.Calculators;

import Java_OOP.Exercise.SOLID.Interfaces.Calculator;
import Java_OOP.Exercise.SOLID.Interfaces.Food;

import java.util.List;

public class QuantityCalculator implements Calculator {


    @Override
    public double sum(List<Food> products) {
        return products.stream().mapToDouble(Food::amountOfFood).sum();
    }

    @Override
    public double average(List<Food> products) {
        return sum(products) / products.size();
    }
}
