package _4_Java_OOP.EXAMS._9_December_2023.harpoonDiver.models.diving;

import _4_Java_OOP.EXAMS._9_December_2023.harpoonDiver.models.diver.Diver;
import _4_Java_OOP.EXAMS._9_December_2023.harpoonDiver.models.divingSite.DivingSite;

import java.util.Collection;

public interface Diving {

    void searching(DivingSite divingSite, Collection<Diver> divers);
}
