package project;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidWithdrawalException extends Exception {

    InvalidWithdrawalException(String message) {
        super(message);
    }
}

public class ATMWithdrawal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Account Number: ");
            long accountNumber = sc.nextLong();

            System.out.print("Enter Account Balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter Withdrawal Amount: ");
            double withdrawalAmount = sc.nextDouble();

            if (withdrawalAmount <= 0) {
                throw new InvalidWithdrawalException(
                        "Invalid Withdrawal Amount"
                );
            }

            if (withdrawalAmount > balance) {
                throw new InsufficientBalanceException(
                        "Insufficient Balance"
                );
            }

            balance = balance - withdrawalAmount;

            System.out.println("Withdrawal Successful");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Remaining Balance: " + balance);

        }
        catch (InvalidWithdrawalException e) {

            System.out.println(e.getMessage());

        }
        catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        }
        finally {

            System.out.println("ATM Transaction Completed.");

        }

        sc.close();
    }
}
