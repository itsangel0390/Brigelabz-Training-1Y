public class CurrentAccount extends Account {

    private static final double INTEREST_RATE = 0.02;

    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    @Override
    public void displayAccount() {
        System.out.println("Account Type : Current Account (2% Interest)");
        super.displayAccount();
    }
}
