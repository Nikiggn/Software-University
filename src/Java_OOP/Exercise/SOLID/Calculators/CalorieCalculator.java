package Java_OOP.Exercise.SOLID.Calculators;

import Java_OOP.Exercise.SOLID.Interfaces.Calculator;
import Java_OOP.Exercise.SOLID.Interfaces.Food;
import Java_OOP.Exercise.SOLID.Interfaces.Product;

import java.util.List;

public class CalorieCalculator implements Calculator {
    @Override
    public double sum(List<Food> products) {
        return products.stream().mapToDouble(Product::amountOfCalories).sum();
    }

    @Override
    public double average(List<Food> products) {
        return sum(products) / products.size();
    }
}
