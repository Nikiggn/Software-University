package _4_Java_OOP.EXAMS._9_December_2023.harpoonDiver.models.divingSite;

import java.util.ArrayList;
import java.util.Collection;

import static _4_Java_OOP.EXAMS._9_December_2023.harpoonDiver.common.ExceptionMessages.SITE_NAME_NULL_OR_EMPTY;

public class DivingSiteImpl implements DivingSite{
    private String name;
    private Collection<String> seaCreatures;

    public DivingSiteImpl(String name) {
        this.setName(name);
        this.seaCreatures = new ArrayList<>();
    }


    @Override
    public Collection<String> getSeaCreatures() {
        return this.seaCreatures;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new NullPointerException(SITE_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }
}
