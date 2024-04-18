package _4_Java_OOP.EXAMS._8_April_2023.robotService.repositories;

import _4_Java_OOP.EXAMS._8_April_2023.robotService.entities.supplements.Supplement;

import java.util.ArrayList;
import java.util.Collection;

public class SupplementRepository implements Repository{

    private Collection<Supplement> supplements;

    public SupplementRepository() {
        this.supplements = new ArrayList<>();
    }

    @Override
    public void addSupplement(Supplement supplement) {
        this.supplements.add(supplement);
    }

    @Override
    public boolean removeSupplement(Supplement supplement) {
        return this.supplements.remove(supplement);
    }

    @Override
    public Supplement findFirst(String type) {
        for (Supplement supplement: supplements) {
            if (supplement.getClass().getSimpleName().equals(type)) {
                return supplement;
            }
        }
        return null;
    }
}
