package Not_Finished.restaurant.models.working;

import Not_Finished.restaurant.models.client.Client;
import Not_Finished.restaurant.models.waiter.Waiter;

import java.util.Collection;

public class WorkingImpl implements Working{

    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    @Override
    public void takingOrders(Client client, Collection<Waiter> waiters) {
        for (Waiter waiter : waiters) {
            while (waiter.canWork() && !client.getClientOrders().isEmpty()) {
                waiter.work(); // Decrease efficiency
                String order = client.getClientOrders().iterator().next(); // Get the next order
                waiter.takenOrders().getOrdersList().add(order); // Add the order to waiter's taken orders
                client.getClientOrders().remove(order); // Remove the order from client's orders
            }
        }
    }
}
