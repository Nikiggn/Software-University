package bank.entities.client;

public class BaseClient implements Client{

    private String name;
    private String ID;
    private  int interest;


    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public int getInterest() {
        return 0;
    }

    @Override
    public double getIncome() {
        return 0;
    }

    @Override
    public void increase() {

    }
}
