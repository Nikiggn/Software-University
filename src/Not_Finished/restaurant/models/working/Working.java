package Not_Finished.restaurant.models.working;

import Not_Finished.restaurant.models.client.Client;
import Not_Finished.restaurant.models.waiter.Waiter;

import java.util.Collection;

public interface Working {
    void takingOrders(Client client, Collection<Waiter> waiters);

}
