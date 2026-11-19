package project;

import java.util.Scanner;

public class ATMTransaction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current balance: ₹");
        double balance = sc.nextDouble();

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Amount deposited successfully.");
                        System.out.println("Updated Balance: ₹" + balance);
                    } else {
                        System.out.println("Deposit amount must be greater than 0.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Withdrawal amount must be greater than 0.");
                    } 
                    else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } 
                    else {
                        balance = balance - withdraw;
                        System.out.println("Please collect your cash.");
                        System.out.println("Remaining Balance: ₹" + balance);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1 to 4.");
            }

        } while (choice != 4);

        sc.close();
    }
}
