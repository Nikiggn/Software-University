package _4_Java_OOP.EXAMS._9_April_2022.fairyShop.repositories;

import _4_Java_OOP.EXAMS._9_April_2022.fairyShop.models.Present;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PresentRepository implements Repository<Present> {

    private Collection<Present> presents;

    public PresentRepository() {
        this.presents = new ArrayList<>();
    }


    @Override
    public Collection<Present> getModels() {
        return Collections.unmodifiableCollection(this.presents);
    }

    @Override
    public void add(Present model) {
        this.presents.add(model);
    }

    @Override
    public boolean remove(Present model) {
        return this.presents.remove(model);
    }

    @Override
    public Present findByName(String name) {
        for (Present present : presents) {
            if (present.getName().equals(name)) {
                return present;
            }
        }
        return null;
    }
}
