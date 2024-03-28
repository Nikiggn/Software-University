package Java_OOP.EXAM_Preparation._8_April_2023.robotService;

import Java_OOP.EXAM_Preparation._8_April_2023.robotService.core.Engine;
import Java_OOP.EXAM_Preparation._8_April_2023.robotService.core.EngineImpl;

public class Main {
    public static void main(String[] args) {

        Engine engine = new EngineImpl();
        engine.run();
    }
}
