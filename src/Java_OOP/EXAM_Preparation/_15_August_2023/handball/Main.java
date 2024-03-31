package Java_OOP.EXAM_Preparation._15_August_2023.handball;

import Java_OOP.EXAM_Preparation._15_August_2023.handball.core.Engine;
import Java_OOP.EXAM_Preparation._15_August_2023.handball.core.EngineImpl;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
