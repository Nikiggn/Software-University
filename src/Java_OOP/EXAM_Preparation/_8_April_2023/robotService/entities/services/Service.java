package Java_OOP.EXAM_Preparation._8_April_2023.robotService.entities.services;

import Java_OOP.EXAM_Preparation._8_April_2023.robotService.entities.robot.Robot;
import Java_OOP.EXAM_Preparation._8_April_2023.robotService.entities.supplements.Supplement;

import java.util.Collection;

public interface Service {
    String getName();

    void setName(String name);

    Collection<Robot> getRobots();

    Collection<Supplement> getSupplements();

    void addRobot(Robot robot);

    void removeRobot(Robot robot);

    void addSupplement(Supplement supplement);

    void feeding();

    int sumHardness();

    String getStatistics();
}
