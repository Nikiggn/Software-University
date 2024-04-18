package _4_Java_OOP.EXAMS._9_December_2023.harpoonDiver.models.diving;

import _4_Java_OOP.EXAMS._9_December_2023.harpoonDiver.models.diver.Diver;
import _4_Java_OOP.EXAMS._9_December_2023.harpoonDiver.models.divingSite.DivingSite;

import java.util.Collection;

public class DivingImpl implements Diving{
    @Override
    public void searching(DivingSite divingSite, Collection<Diver> divers) {
        Collection<String> divingSits = divingSite.getSeaCreatures();
        for (Diver diver : divers) {
            while (diver.canDive() && divingSits.iterator().hasNext()) {
                diver.shoot();
                String currentDivingSits = divingSits.iterator().next();
                diver.getSeaCatch().getSeaCreatures().add(currentDivingSits);
                divingSits.remove(currentDivingSits);
            }
        }
    }
}
