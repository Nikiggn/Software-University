package Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.models.diving;

import Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.models.diver.Diver;
import Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.models.divingSite.DivingSite;

import java.util.Collection;

public interface Diving {

    void searching(DivingSite divingSite, Collection<Diver> divers);
}
