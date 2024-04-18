package _4_Java_OOP.EXAMS._15_August_2023.handball;

import _4_Java_OOP.EXAMS._15_August_2023.handball.core.Engine;
import _4_Java_OOP.EXAMS._15_August_2023.handball.core.EngineImpl;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
