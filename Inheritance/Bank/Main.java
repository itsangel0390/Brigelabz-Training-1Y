package Inheritance.Bank;
public class Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.accountNumber = 101;
        s.balance = 5000;
        s.interestRate = 4.5;
        CheckingAccount c = new CheckingAccount();
        c.accountNumber = 102;
        c.balance = 3000;
        c.withdrawalLimit = 1000;
        FixedDepositAccount f = new FixedDepositAccount();
        f.accountNumber = 103;
        f.balance = 10000;
        f.duration = 12;
        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}
