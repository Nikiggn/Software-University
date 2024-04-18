package _4_Java_OOP.EXAMS._9_December_2023.harpoonDiver.repositories;

import java.util.Collection;

public interface Repository<T> {
    Collection<T> getCollection();

    void add(T entity);

    boolean remove(T entity);

    T byName(String name);
}
