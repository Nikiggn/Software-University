package bank.entities.loan;

public class MortgageLoan extends BaseLoan {
    private static final int INTEREST = 3;
    private static final int AMOUNT = 50000;

    protected MortgageLoan() {
        super(INTEREST, AMOUNT);
    }
}
