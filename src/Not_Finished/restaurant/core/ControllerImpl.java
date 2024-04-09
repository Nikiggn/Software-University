package Not_Finished.restaurant.core;

import Not_Finished.restaurant.models.client.Client;
import Not_Finished.restaurant.models.waiter.FullTimeWaiter;
import Not_Finished.restaurant.models.waiter.HalfTimeWaiter;
import Not_Finished.restaurant.models.waiter.Waiter;
import Not_Finished.restaurant.models.working.Working;
import Not_Finished.restaurant.models.working.WorkingImpl;
import Not_Finished.restaurant.repositories.ClientRepository;
import Not_Finished.restaurant.repositories.Repository;
import Not_Finished.restaurant.repositories.WaiterRepository;

import java.util.Collection;

import static Not_Finished.restaurant.common.ConstantMessages.*;
import static Not_Finished.restaurant.common.ExceptionMessages.*;

public class ControllerImpl implements Controller {
    private Repository<Waiter> waiterRepository;
    private Repository<Client> clientRepository;

    //!!!!!!!!

    public ControllerImpl() {
        this.waiterRepository = new WaiterRepository();
        this.clientRepository = new ClientRepository();
    }


    @Override
    public String addWaiter(String type, String waiterName) {
        Waiter waiter;

        if (type.equals("FullTimeWaiter")) {
            waiter = new FullTimeWaiter(waiterName);
        } else if (type.equals(waiterName)) {
            waiter = new HalfTimeWaiter(waiterName);
        } else {
            throw new IllegalArgumentException(WAITER_INVALID_TYPE);
        }
        this.waiterRepository.add(waiter);
        return String.format(WAITER_ADDED, type, waiterName);
    }

    @Override
    public String addClient(String clientName, String... orders) {
        Client client = this.clientRepository.byName(clientName);

        for (String order : orders) {
            client.getClientOrders().add(order);
        }
        this.clientRepository.add(client);
        return String.format(CLIENT_ADDED, clientName);
    }

    @Override
    public String removeWaiter(String waiterName) {

        Waiter waiter = waiterRepository.byName(waiterName);
        if (waiter == null) {
            throw new IllegalArgumentException(String.format(WAITER_DOES_NOT_EXIST, waiterName));
        }
        this.waiterRepository.remove(waiter);
        return String.format(WAITER_REMOVE, waiterName);
    }

    @Override
    public String removeClient(String clientName) {

        Client client = clientRepository.byName(clientName);
        if (client == null) {
            throw new IllegalArgumentException(String.format(CLIENT_DOES_NOT_EXIST, clientName));
        }

        this.clientRepository.add(client);
        return String.format(CLIENT_REMOVE, clientName);
    }

    @Override
    public String startWorking(String clientName) {
        if (waiterRepository.getCollection().isEmpty()) {
            throw new IllegalArgumentException(THERE_ARE_NO_WAITERS);
        }

        Working working = new WorkingImpl();
        Collection<Waiter> waiters = this.waiterRepository.getCollection();
        Client client = this.clientRepository.byName(clientName);

        working.takingOrders(client, waiters);
        return String.format(ORDERS_SERVING, clientName);
    }

    @Override
    public String getStatistics() {
        return null;
    }

//    @Override
//    public String getStatistics() {
//
////        StringBuilder statistics = new StringBuilder();
////        statistics.append(String.format(FINAL_CLIENTS_COUNT, )).append(System.lineSeparator());
////        statistics.append(FINAL_WAITERS_STATISTICS).append(System.lineSeparator());
////        for (Waiter waiter : this.waiterRepository.getCollection()) {
////            statistics.append(String.format(FINAL_WAITER_NAME, waiter.getName())).append(System.lineSeparator());
////            statistics.append(String.format(FINAL_WAITER_EFFICIENCY, waiter.getEfficiency())).append(System.lineSeparator());
////            if (waiter.takenOrders().getOrdersList().isEmpty()) {
////                statistics.append(String.format(FINAL_WAITER_ORDERS, "none")).append(System.lineSeparator());
////            } else {
////                statistics.append(String.format(FINAL_WAITER_ORDERS, String.join(FINAL_WAITER_ORDERS_DELIMITER, waiter.takenOrders().getOrdersList()))).append(System.lineSeparator());
////            }
////        }
////        return statistics.toString().trim();
//    }
}
