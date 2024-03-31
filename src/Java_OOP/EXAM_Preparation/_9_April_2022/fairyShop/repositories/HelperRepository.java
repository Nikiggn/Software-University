package Java_OOP.EXAM_Preparation._9_April_2022.fairyShop.repositories;

import Java_OOP.EXAM_Preparation._9_April_2022.fairyShop.models.Helper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HelperRepository implements  Repository<Helper>{

    private Collection<Helper> helpers;

    public HelperRepository() {
        this.helpers = new ArrayList<>();
    }

    @Override
    public Collection<Helper> getModels() {
        return Collections.unmodifiableCollection(this.helpers);
    }

    @Override
    public void add(Helper model) {
        this.helpers.add(model);
    }

    @Override
    public boolean remove(Helper model) {
        return this.helpers.remove(model);
    }

    @Override
    public Helper findByName(String name) {
        for (Helper helper : helpers) {
            if (helper.getName().equals(name)){
                return helper;
            }
        }
        return null;
    }
}
