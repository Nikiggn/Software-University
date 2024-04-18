package _4_Java_OOP.EXAMS._14_August_2022.football.repositories;

import _4_Java_OOP.EXAMS._14_August_2022.football.entities.supplement.Supplement;

public interface SupplementRepository {
    void add(Supplement supplement);

    boolean remove(Supplement supplement);

    Supplement findByType(String type);
}
