package _4_Java_OOP.EXAMS._8_April_2023.robotService.repositories;

import _4_Java_OOP.EXAMS._8_April_2023.robotService.entities.supplements.Supplement;

public interface Repository {

    void addSupplement(Supplement supplement);

    boolean removeSupplement(Supplement supplement);

    Supplement findFirst(String type);
}
