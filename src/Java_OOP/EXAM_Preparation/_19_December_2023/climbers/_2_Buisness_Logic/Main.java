package Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic;

import Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.core.Controller;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.core.ControllerImpl;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.core.Engine;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.core.EngineImpl;

public class Main {

    public static void main(String[] args) {
        //TODO
        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
