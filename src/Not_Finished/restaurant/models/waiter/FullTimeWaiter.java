package Not_Finished.restaurant.models.waiter;


public class FullTimeWaiter extends  BaseWaiter {
    private static final int EFFICIENCY = 8;

    public FullTimeWaiter(String name) {
        super(name, EFFICIENCY );
    }

    @Override
    public void work() {
        int newEfficiency = getEfficiency() - 1;
        setEfficiency(Math.max(0, newEfficiency));

    }
}
