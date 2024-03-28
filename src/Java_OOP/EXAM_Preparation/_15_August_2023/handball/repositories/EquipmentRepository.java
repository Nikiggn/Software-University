package Java_OOP.EXAM_Preparation._15_August_2023.handball.repositories;

import Java_OOP.EXAM_Preparation._15_August_2023.handball.entities.equipment.Equipment;

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
