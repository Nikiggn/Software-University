package _4_Java_OOP.EXAMS._15_August_2023.handball.repositories;

import _4_Java_OOP.EXAMS._15_August_2023.handball.entities.equipment.Equipment;

import java.util.ArrayList;
import java.util.Collection;

public class EquipmentRepository implements Repository{

    private Collection<Equipment> equipments;

    public EquipmentRepository() {
        this.equipments = new ArrayList<>();
    }

    @Override
    public void add(Equipment equipment) {
        this.equipments.add(equipment);
    }

    @Override
    public boolean remove(Equipment equipment) {
        return this.equipments.remove(equipment);
    }

    @Override
    public Equipment findByType(String type) {
        for (Equipment equipment:equipments) {
            if (equipment.getClass().getSimpleName().equals(type)){
                return equipment;
            }
        }
        return null;
    }
}
