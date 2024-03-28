package Java_OOP.EXAM_Preparation._22August2022.goldDigger;

import Java_OOP.EXAM_Preparation._22August2022.goldDigger.core.Controller;
import Java_OOP.EXAM_Preparation._22August2022.goldDigger.core.ControllerImpl;
import Java_OOP.EXAM_Preparation._22August2022.goldDigger.core.Engine;
import Java_OOP.EXAM_Preparation._22August2022.goldDigger.core.EngineImpl;

public class Main {

    public static void main(String[] args) {
        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
