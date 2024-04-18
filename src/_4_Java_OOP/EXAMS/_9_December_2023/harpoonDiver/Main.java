package _4_Java_OOP.EXAMS._9_December_2023.harpoonDiver;

import _4_Java_OOP.EXAMS._9_December_2023.harpoonDiver.core.Controller;
import _4_Java_OOP.EXAMS._9_December_2023.harpoonDiver.core.Engine;
import _4_Java_OOP.EXAMS._9_December_2023.harpoonDiver.core.EngineImpl;

public class Main {

    public static void main(String[] args) {
        Controller controller = null; //TODO new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
