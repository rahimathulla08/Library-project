package project;

class BankAccount {

    // Data members
    private int accountNumber;
    private String customerName;
    private double balance;

    // Constructor
    BankAccount(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    // Deposit money
    void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } 
        else {
            balance = balance - amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
    }

    // Display account details
    void displayAccountDetails() {

        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Balance        : ₹" + balance);
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        // Creating object
        BankAccount account =
                new BankAccount(1001, "Rahul", 10000);

        // Operations
        account.deposit(5000);
        account.withdraw(3000);

        // Display final details
        account.displayAccountDetails();
    }
}
