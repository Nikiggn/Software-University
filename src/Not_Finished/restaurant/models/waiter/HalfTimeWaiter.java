package Not_Finished.restaurant.models.waiter;


public class HalfTimeWaiter  extends  BaseWaiter{

    private static final int EFFICIENCY = 4;

    public HalfTimeWaiter(String name) {
        super(name, EFFICIENCY);
    }


    @Override
    public void work() {
        int newEfficiency = getEfficiency() - 2;
        setEfficiency(Math.max(0, newEfficiency));

    }

}
