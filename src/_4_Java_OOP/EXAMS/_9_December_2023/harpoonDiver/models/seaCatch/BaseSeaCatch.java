package _4_Java_OOP.EXAMS._9_December_2023.harpoonDiver.models.seaCatch;

import java.util.ArrayList;
import java.util.Collection;

public class BaseSeaCatch implements SeaCatch{

    private Collection<String> 	seaCreatures;

    public BaseSeaCatch() {
        this.seaCreatures = new ArrayList<>();
    }

    @Override
    public Collection<String> getSeaCreatures() {
        return this.seaCreatures;
    }
}
