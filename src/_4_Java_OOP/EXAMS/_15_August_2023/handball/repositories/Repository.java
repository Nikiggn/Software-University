package _4_Java_OOP.EXAMS._15_August_2023.handball.repositories;

import _4_Java_OOP.EXAMS._15_August_2023.handball.entities.equipment.Equipment;

public interface Repository {
    void add(Equipment equipment);
    boolean remove(Equipment equipment);
    Equipment findByType(String type);
}
