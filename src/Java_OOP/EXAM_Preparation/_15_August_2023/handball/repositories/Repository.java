package Java_OOP.EXAM_Preparation._15_August_2023.handball.repositories;

import Java_OOP.EXAM_Preparation._15_August_2023.handball.entities.equipment.Equipment;

public interface Repository {
    void add(Equipment equipment);
    boolean remove(Equipment equipment);
    Equipment findByType(String type);
}
