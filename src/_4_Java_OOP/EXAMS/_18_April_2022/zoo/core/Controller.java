package _4_Java_OOP.EXAMS._18_April_2022.zoo.core;

public interface Controller {
    String addArea(String areaType, String areaName);
    String buyFood(String foodType);
    String foodForArea(String areaName, String foodType);
    String addAnimal(String areaName, String animalType, String animalName, String kind, double price);
    String feedAnimal(String areaName);
    String calculateKg(String areaName);
    String getStatistics();
}
