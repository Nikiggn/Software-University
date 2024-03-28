package bank.entities.loan;

public class StudentLoan extends BaseLoan {
    private static final int INTEREST = 1;
    private static final int AMOUNT = 10000;

    protected StudentLoan() {
        super(INTEREST, AMOUNT);
    }
}
