package project;

class Product {

    // Data members
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    // Constructor
    Product(int productId, String productName,
            double price, int quantity) {

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Display product details
    void displayProductDetails() {

        System.out.println("\n--- Product Details ---");
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
        System.out.println("Quantity     : " + quantity);
    }

    // Update price
    void updatePrice(double newPrice) {

        if (newPrice > 0) {
            price = newPrice;
            System.out.println("Price updated successfully.");
        } else {
            System.out.println("Invalid price.");
        }
    }

    // Increase stock
    void increaseStock(int amount) {

        if (amount > 0) {
            quantity = quantity + amount;
            System.out.println("Stock increased by " + amount);
        } else {
            System.out.println("Invalid stock amount.");
        }
    }

    // Decrease stock
    void decreaseStock(int amount) {

        if (amount <= 0) {
            System.out.println("Invalid purchase quantity.");
        }
        else if (amount > quantity) {
            System.out.println("Not enough stock available.");
        }
        else {
            quantity = quantity - amount;
            System.out.println("Purchased quantity: " + amount);
        }
    }

    // Display stock status
    void displayStockStatus() {

        if (quantity == 0) {
            System.out.println("Stock Status : Out of Stock");
        } else {
            System.out.println("Stock Status : Available");
        }
    }
}

public class ProductDemo {

    public static void main(String[] args) {

        // Creating object
        Product product =
                new Product(101, "Laptop", 55000, 10);

        // Customer purchases 3 laptops
        product.decreaseStock(3);

        // Display updated details
        product.displayProductDetails();

        // Display stock status
        product.displayStockStatus();
    }
}
