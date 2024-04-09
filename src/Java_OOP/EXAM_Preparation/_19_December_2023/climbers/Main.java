package Java_OOP.EXAM_Preparation._19_December_2023.climbers;

import Java_OOP.EXAM_Preparation._19_December_2023.climbers.core.Controller;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers.core.ControllerImpl;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers.core.Engine;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers.core.EngineImpl;

public class Main {

    public static void main(String[] args) {

        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
