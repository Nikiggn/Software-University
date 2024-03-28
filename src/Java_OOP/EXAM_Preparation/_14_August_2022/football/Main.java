package Java_OOP.EXAM_Preparation._14_August_2022.football;

import Java_OOP.EXAM_Preparation._14_August_2022.football.core.Engine;
import Java_OOP.EXAM_Preparation._14_August_2022.football.core.EngineImpl;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
