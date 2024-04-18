package _4_Java_OOP.EXAMS._19_December_2023.climbers;

import _4_Java_OOP.EXAMS._19_December_2023.climbers.core.Controller;
import _4_Java_OOP.EXAMS._19_December_2023.climbers.core.ControllerImpl;
import _4_Java_OOP.EXAMS._19_December_2023.climbers.core.Engine;
import _4_Java_OOP.EXAMS._19_December_2023.climbers.core.EngineImpl;

public class Main {

    public static void main(String[] args) {

        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
