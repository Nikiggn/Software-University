package Not_Finished.restaurant.models.waiter;


import Not_Finished.restaurant.models.orders.TakenOrders;
import Not_Finished.restaurant.models.orders.TakenOrdersImpl;

import static Not_Finished.restaurant.common.ExceptionMessages.WAITER_EFFICIENCY_LESS_THAN_ZERO;
import static Not_Finished.restaurant.common.ExceptionMessages.WAITER_NAME_NULL_OR_EMPTY;

public  abstract class BaseWaiter implements Waiter {
    private String name;
    private int efficiency;
    private TakenOrders takenOrders;

    protected BaseWaiter(String name, int efficiency) {
        this.setName(name);
        this.setEfficiency(efficiency);
        this.takenOrders = new TakenOrdersImpl();
    }

    @Override
    public String getName() {
        return this.name ;
    }

    @Override
    public int getEfficiency() {
        return this.efficiency;
    }

    @Override
    public boolean canWork() {
        return this.efficiency > 0;
    }


    //!!!!!
    @Override
    public TakenOrders takenOrders() {
        return this.takenOrders;
    }

    @Override
    public abstract void work();

    public void setName(String name){
        if (name == null || name.trim().isEmpty()){
            throw new NullPointerException(WAITER_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    public void setEfficiency(int efficiency){
        if (efficiency < 0){
            throw new IllegalArgumentException(WAITER_EFFICIENCY_LESS_THAN_ZERO);
        }
        this.efficiency = efficiency;
    }

}
