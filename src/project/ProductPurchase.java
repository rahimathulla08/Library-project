package project;

import java.util.Scanner;

class InsufficientStockException extends Exception {

    InsufficientStockException(String message) {
        super(message);
    }
}

class InvalidQuantityException extends Exception {

    InvalidQuantityException(String message) {
        super(message);
    }
}

public class ProductPurchase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Product Name: ");
            String productName = sc.nextLine();

            System.out.print("Enter Product Price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Enter Available Stock: ");
            int availableStock = sc.nextInt();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            if (quantity <= 0) {
                throw new InvalidQuantityException(
                        "Invalid Quantity"
                );
            }

            if (quantity > availableStock) {
                throw new InsufficientStockException(
                        "Insufficient Stock"
                );
            }

            double totalPrice = productPrice * quantity;

            System.out.println();
            System.out.println("Purchase Successful");
            System.out.println("Product Name: " + productName);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Price: Rs. " + totalPrice);

        }
        catch (InvalidQuantityException e) {

            System.out.println(e.getMessage());

        }
        catch (InsufficientStockException e) {

            System.out.println(e.getMessage());

        }
        finally {

            System.out.println("Thank you for shopping with us.");

        }

        sc.close();
    }
}
