public class TestBank {

    public static void main(String[] args) {

        System.out.println("=== " + Account.bankName + " ===\n");

        Account[] accounts = {
            new SavingsAccount(2001, "Aarav Sharma", 50000.00),
            new CurrentAccount(2002, "Priya Patel", 120000.00)
        };

        for (Account acc : accounts) {
            System.out.println("-----------------------------");
            acc.displayAccount();
        }

        System.out.println("-----------------------------");
    }
}
