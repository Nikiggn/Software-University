package _4_Java_OOP.EXAMS._9_April_2022.fairyShop.core;

public interface Controller {
    String addHelper(String type, String helperName);

    String addInstrumentToHelper(String helperName, int power);

    String addPresent(String presentName, int energyRequired);

    String craftPresent(String presentName);

    String report();
}
