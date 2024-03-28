package Java_OOP.EXAM_Preparation._8_April_2023.robotService.repositories;

import Java_OOP.EXAM_Preparation._8_April_2023.robotService.entities.supplements.Supplement;

public interface Repository {

    void addSupplement(Supplement supplement);

    boolean removeSupplement(Supplement supplement);

    Supplement findFirst(String type);
}
