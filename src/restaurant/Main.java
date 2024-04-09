package Not_Finished.restaurant;

import Not_Finished.restaurant.core.Controller;
import Not_Finished.restaurant.core.ControllerImpl;
import Not_Finished.restaurant.core.Engine;
import Not_Finished.restaurant.core.EngineImpl;

public class Main {

    public static void main(String[] args) {

        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
