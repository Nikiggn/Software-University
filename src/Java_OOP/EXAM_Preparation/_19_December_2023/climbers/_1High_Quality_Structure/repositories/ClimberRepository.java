package Java_OOP.EXAM_Preparation._19_December_2023.climbers._1High_Quality_Structure.repositories;

import Java_OOP.EXAM_Preparation._19_December_2023.climbers._1High_Quality_Structure.models.climber.Climber;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ClimberRepository implements Repository<Climber>{
    private Collection<Climber> climbers;

    public ClimberRepository() {
        this.climbers = new ArrayList<>();
    }


    @Override
    public Collection<Climber> getCollection() {
        return Collections.unmodifiableCollection(climbers);
    }

    @Override
    public void add(Climber entity) {
        this.climbers.add(entity);
    }

    @Override
    public boolean remove(Climber entity) {
        return this.climbers.remove(entity);
    }

    @Override
    public Climber byName(String name) {
        for (Climber climber:climbers) {
            if (climber.getName().equals(name)){
                return climber;
            }
        }
        return null;
    }
}
