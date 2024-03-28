package Java_OOP.EXAM_Preparation._22August2022.goldDigger.models.discoverer;

import Java_OOP.EXAM_Preparation._22August2022.goldDigger.models.museum.Museum;

public interface Discoverer {
    String getName();

    double getEnergy();

    boolean canDig();

    Museum getMuseum();

    void dig();
}
