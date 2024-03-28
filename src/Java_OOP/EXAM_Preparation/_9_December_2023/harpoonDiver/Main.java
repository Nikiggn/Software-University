package Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver;

import Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.core.Controller;
import Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.core.Engine;
import Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.core.EngineImpl;

public class Main {

    public static void main(String[] args) {
        Controller controller = null; //TODO new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
