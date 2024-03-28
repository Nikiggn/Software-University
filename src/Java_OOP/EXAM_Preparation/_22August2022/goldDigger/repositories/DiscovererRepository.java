package Java_OOP.EXAM_Preparation._22August2022.goldDigger.repositories;

import Java_OOP.EXAM_Preparation._22August2022.goldDigger.models.discoverer.Discoverer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class DiscovererRepository implements  Repository<Discoverer> {

    private  Collection<Discoverer> discoverers;
    private int size;
    private Stream<Discoverer> stream;

    public DiscovererRepository() {
        this.discoverers = new ArrayList<>();
    }

    @Override
    public Collection<Discoverer> getCollection() {
        return Collections.unmodifiableCollection(discoverers);
    }

    @Override
    public void add(Discoverer entity) {
        this.discoverers.add(entity);
    }

    @Override
    public boolean remove(Discoverer entity) {
        return this.discoverers.remove(entity);
    }

    @Override
    public Discoverer byName(String name) {
        return this.discoverers.stream()
                .filter(discoverer -> discoverer.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
