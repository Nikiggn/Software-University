package _4_Java_OOP.EXAMS._15_August_2023.handball.entities.gameplay;

import _4_Java_OOP.EXAMS._15_August_2023.handball.entities.team.Team;
import _4_Java_OOP.EXAMS._15_August_2023.handball.entities.equipment.Equipment;

import java.util.Collection;

public interface Gameplay {
    int allProtection();

    void addTeam(Team team);

    void removeTeam(Team team);

    void addEquipment(Equipment equipment);

    void teamsInGameplay();

    Collection<Team> getTeam();

    Collection<Equipment> getEquipments();

    String getName();


}
