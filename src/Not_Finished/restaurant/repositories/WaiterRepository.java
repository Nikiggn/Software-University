package Not_Finished.restaurant.repositories;

import Not_Finished.restaurant.models.waiter.Waiter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class WaiterRepository implements Repository<Waiter>{

    private Collection<Waiter> waiters;

    public WaiterRepository() {
        this.waiters = new ArrayList<>();
    }

    @Override
    public Collection<Waiter> getCollection() {
        return Collections.unmodifiableCollection(this.waiters);
    }

    @Override
    public void add(Waiter entity) {
        this.waiters.add(entity);

    }

    @Override
    public boolean remove(Waiter entity) {
        return this.waiters.remove(entity);
    }

    @Override
    public Waiter byName(String name) {
        for (Waiter waiter : this.waiters) {
            if (waiter.getName().equals(name)){
                return waiter;
            }
        }
        return null;
    }
}
