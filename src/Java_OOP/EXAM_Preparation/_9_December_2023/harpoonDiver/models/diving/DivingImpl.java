package Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.models.diving;

import Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.models.diver.Diver;
import Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.models.divingSite.DivingSite;
import Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.models.seaCatch.SeaCatch;

import java.util.Collection;
import java.util.stream.Collectors;

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
