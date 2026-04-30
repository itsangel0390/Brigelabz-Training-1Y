package Inheritance.Bank;
class FixedDepositAccount extends BankAccount {
    int duration;
    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}