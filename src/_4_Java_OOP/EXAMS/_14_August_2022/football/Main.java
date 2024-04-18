package _4_Java_OOP.EXAMS._14_August_2022.football;

import _4_Java_OOP.EXAMS._14_August_2022.football.core.Engine;
import _4_Java_OOP.EXAMS._14_August_2022.football.core.EngineImpl;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
