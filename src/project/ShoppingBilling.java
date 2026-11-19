package project;

import java.util.Scanner;

public class ShoppingBilling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalAmount = 0;
        char continueShopping;

        do {

            sc.nextLine(); // Clear newline

            System.out.print("\nEnter product name: ");
            String productName = sc.nextLine();

            double price;

            while (true) {

                System.out.print("Enter price: ₹");
                price = sc.nextDouble();

                if (price > 0) {
                    break;
                } else {
                    System.out.println(
                        "Invalid price. Price must be greater than 0."
                    );
                }
            }

            int quantity;

            while (true) {

                System.out.print("Enter quantity: ");
                quantity = sc.nextInt();

                if (quantity > 0) {
                    break;
                } else {
                    System.out.println(
                        "Invalid quantity. Quantity must be greater than 0."
                    );
                }
            }

            double itemTotal = price * quantity;

            System.out.println("Item: " + productName);
            System.out.println("Item Total: ₹" + itemTotal);

            totalAmount = totalAmount + itemTotal;

            System.out.print("\nDo you want to continue shopping? (Y/N): ");
            continueShopping = sc.next().charAt(0);

        } while (continueShopping == 'Y' ||
                 continueShopping == 'y');

        // Calculate discount

        double discountRate;

        if (totalAmount >= 10000) {
            discountRate = 20;
        }
        else if (totalAmount >= 5000) {
            discountRate = 10;
        }
        else if (totalAmount >= 2000) {
            discountRate = 5;
        }
        else {
            discountRate = 0;
        }

        double discountAmount =
                totalAmount * discountRate / 100;

        double finalAmount =
                totalAmount - discountAmount;

        // Display final bill

        System.out.println("\n========== FINAL BILL ==========");
        System.out.println("Total Amount    : ₹" + totalAmount);
        System.out.println("Discount Rate   : " + discountRate + "%");
        System.out.println("Discount Amount : ₹" + discountAmount);
        System.out.println("Final Payable   : ₹" + finalAmount);
        System.out.println("================================");

        sc.close();
    }
}