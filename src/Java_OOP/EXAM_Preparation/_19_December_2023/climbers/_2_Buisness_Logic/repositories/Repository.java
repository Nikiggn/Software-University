package Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.repositories;

import java.util.Collection;

public interface Repository<T> {
    Collection<T> getCollection();

    void add(T entity);

    boolean remove(T entity);

    T byName(String name);
}
