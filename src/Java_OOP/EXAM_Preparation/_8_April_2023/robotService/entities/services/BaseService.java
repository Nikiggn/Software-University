package Java_OOP.EXAM_Preparation._8_April_2023.robotService.entities.services;

import Java_OOP.EXAM_Preparation._8_April_2023.robotService.entities.robot.Robot;
import Java_OOP.EXAM_Preparation._8_April_2023.robotService.entities.supplements.Supplement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static Java_OOP.EXAM_Preparation._8_April_2023.robotService.common.ConstantMessages.NOT_ENOUGH_CAPACITY_FOR_ROBOT;
import static Java_OOP.EXAM_Preparation._8_April_2023.robotService.common.ExceptionMessages.SERVICE_NAME_CANNOT_BE_NULL_OR_EMPTY;

public abstract class BaseService implements Service{
    private String name;
    private int capacity;
    private Collection<Supplement> supplements;
    private Collection<Robot> robots;

    protected BaseService(String name, int capacity) {
        this.setName(name);
        this.capacity = capacity;
        this.supplements = new ArrayList<>();
        this.robots = new ArrayList<>();
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        if (name == null || name.trim().length() < 1){
            throw new NullPointerException(SERVICE_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public Collection<Robot> getRobots() {
        return Collections.unmodifiableCollection(robots);
    }

    @Override
    public Collection<Supplement> getSupplements() {
        return Collections.unmodifiableCollection(supplements);
    }

    @Override
    public void addRobot(Robot robot) {
        if (this.robots.size() < this.capacity) {
            this.robots.add(robot);
        }else {
            throw new IllegalStateException(NOT_ENOUGH_CAPACITY_FOR_ROBOT);
        }
    }

    @Override
    public void removeRobot(Robot robot) {
        this.robots.remove(robot);
    }

    @Override
    public void addSupplement(Supplement supplement) {
        this.supplements.add(supplement);
    }

    @Override
    public void feeding() {
        for (Robot robot:robots) {
            robot.eating();
        }
    }

    @Override
    public int sumHardness() {
        int hardness = 0;
        for (Supplement supplement : this.supplements) {
            hardness += supplement.getHardness();
        }
        return hardness;
    }

    @Override
    public String getStatistics() {
        return null;
    }
}
