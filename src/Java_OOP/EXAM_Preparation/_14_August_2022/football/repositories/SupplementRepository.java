package Java_OOP.EXAM_Preparation._14_August_2022.football.repositories;

import Java_OOP.EXAM_Preparation._14_August_2022.football.entities.supplement.Supplement;

public interface SupplementRepository {
    void add(Supplement supplement);

    boolean remove(Supplement supplement);

    Supplement findByType(String type);
}
