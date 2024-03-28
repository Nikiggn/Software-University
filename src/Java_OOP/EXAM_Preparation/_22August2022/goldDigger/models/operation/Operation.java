package Java_OOP.EXAM_Preparation._22August2022.goldDigger.models.operation;

import Java_OOP.EXAM_Preparation._22August2022.goldDigger.models.discoverer.Discoverer;
import Java_OOP.EXAM_Preparation._22August2022.goldDigger.models.spot.Spot;

import java.util.Collection;

public interface Operation {
    void startOperation(Spot spot, Collection<Discoverer> discoverers);

}
