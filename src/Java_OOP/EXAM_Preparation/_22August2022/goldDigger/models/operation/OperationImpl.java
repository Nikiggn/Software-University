package Java_OOP.EXAM_Preparation._22August2022.goldDigger.models.operation;

import Java_OOP.EXAM_Preparation._22August2022.goldDigger.models.discoverer.Discoverer;
import Java_OOP.EXAM_Preparation._22August2022.goldDigger.models.spot.Spot;

import java.util.Collection;
import java.util.Iterator;

public class OperationImpl implements Operation{


    @Override
    public void startOperation(Spot spot, Collection<Discoverer> discoverers) {

        Collection<String> spots = spot.getExhibits();

        for (Discoverer discoverer : discoverers) {
            Iterator<String> spotIterator = spots.iterator();
            /// dali e s !
            while (discoverer.canDig() && spotIterator.hasNext()){
                discoverer.dig();
                String currentSpot = spots.iterator().next();
                discoverer.getMuseum().getExhibits().add(currentSpot);
                spots.remove(currentSpot);
            }
        }
        // TO DO
        ////////////spot.getExhibits()
    }
}
