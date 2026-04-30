public class Account {

    public static String bankName = "National Savings Bank";

    protected int accountNumber;
    protected String holderName;
    protected double balance;

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public double calculateInterest() {
        return 0.0;
    }

    public void displayAccount() {
        System.out.println("Account No : " + accountNumber);
        System.out.println("Holder     : " + holderName);
        System.out.printf("Balance    : Rs.%.2f%n", balance);
        System.out.printf("Interest   : Rs.%.2f%n", calculateInterest());
    }
}
