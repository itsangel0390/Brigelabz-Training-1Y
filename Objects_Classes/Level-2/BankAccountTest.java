import java.util.Scanner;

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    // Method to deposit money
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Method to display balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankAccountTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.print("Enter Account Holder Name: ");
        acc.accountHolder = sc.nextLine();

        System.out.print("Enter Account Number: ");
        acc.accountNumber = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        acc.balance = sc.nextDouble();

        System.out.print("Enter Amount to Deposit: ");
        double depositAmount = sc.nextDouble();
        acc.deposit(depositAmount);

        System.out.print("Enter Amount to Withdraw: ");
        double withdrawAmount = sc.nextDouble();
        acc.withdraw(withdrawAmount);

        System.out.println("\nAccount Details:");
        System.out.println("Account Holder: " + acc.accountHolder);
        System.out.println("Account Number: " + acc.accountNumber);
        acc.displayBalance();
    }
}