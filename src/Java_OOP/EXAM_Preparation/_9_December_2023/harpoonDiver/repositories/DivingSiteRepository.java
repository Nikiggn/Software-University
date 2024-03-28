package Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.repositories;

import Java_OOP.EXAM_Preparation._9_December_2023.harpoonDiver.models.divingSite.DivingSite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DivingSiteRepository implements Repository<DivingSite> {
    private Collection<DivingSite> divingSites;

    public DivingSiteRepository() {
        this.divingSites = new ArrayList<>();
    }

    @Override
    public Collection<DivingSite> getCollection() {
        return Collections.unmodifiableCollection(divingSites);
    }

    @Override
    public void add(DivingSite entity) {
        this.divingSites.add(entity);
    }

    @Override
    public boolean remove(DivingSite entity) {
        return this.divingSites.remove(entity);
    }

    @Override
    public DivingSite byName(String name) {
        for (DivingSite divingSite: divingSites) {
            if (divingSite.getName().equals(name)){
                return divingSite;
            }
        }
        return null;
    }
}
