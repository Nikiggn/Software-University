package Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.repositories;

import Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.models.diver.Diver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DiverRepository implements Repository<Diver> {
    private Collection<Diver> divers;

    public DiverRepository() {
        this.divers = new ArrayList<>();
    }

    @Override
    public Collection<Diver> getCollection() {
        return Collections.unmodifiableCollection(divers);
    }

    @Override
    public void add(Diver entity) {
        this.divers.add(entity);
    }

    @Override
    public boolean remove(Diver entity) {
        return this.divers.remove(entity);
    }

    @Override
    public Diver byName(String name) {
        for (Diver diver:divers) {
            if (diver.getName().equals(name)){
                return diver;
            }
        }
        return null;
    }
}
