package Java_OOP.EXAM_Preparation._9_April_2022.fairyShop.models;

import java.util.Collection;

public interface Helper {
    void work();

    void addInstrument(Instrument instrument);

    boolean canWork();

    String getName();

    int getEnergy();

    Collection<Instrument> getInstruments();
}
