package project;

abstract class FoodOrder {

    int orderId;
    String customerName;

    FoodOrder(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    void placeOrder() {
        System.out.println("Order placed successfully.");
    }

    abstract double calculateBill();

    void displayOrderDetails() {
        System.out.println("Order ID      : " + orderId);
        System.out.println("Customer Name : " + customerName);
    }
}

class RestaurantOrder extends FoodOrder {

    double foodAmount;
    double deliveryCharge;

    RestaurantOrder(int orderId, String customerName,
                    double foodAmount, double deliveryCharge) {

        super(orderId, customerName);
        this.foodAmount = foodAmount;
        this.deliveryCharge = deliveryCharge;
    }

    @Override
    double calculateBill() {
        return foodAmount + deliveryCharge;
    }
}

class GroceryOrder extends FoodOrder {

    double groceryAmount;
    double deliveryCharge;

    GroceryOrder(int orderId, String customerName,
                 double groceryAmount, double deliveryCharge) {

        super(orderId, customerName);
        this.groceryAmount = groceryAmount;
        this.deliveryCharge = deliveryCharge;
    }

    @Override
    double calculateBill() {
        return groceryAmount + deliveryCharge;
    }
}

public class FoodDeliveryApplication {

    public static void main(String[] args) {

        RestaurantOrder restaurantOrder =
                new RestaurantOrder(
                        101,
                        "Rahim",
                        450,
                        50
                );

        GroceryOrder groceryOrder =
                new GroceryOrder(
                        102,
                        "Arun",
                        1000,
                        30
                );

        System.out.println("----- Restaurant Order -----");

        restaurantOrder.displayOrderDetails();
        restaurantOrder.placeOrder();

        System.out.println("Calculated Bill : Rs. "
                           + restaurantOrder.calculateBill());

        System.out.println();

        System.out.println("----- Grocery Order -----");

        groceryOrder.displayOrderDetails();
        groceryOrder.placeOrder();

        System.out.println("Calculated Bill : Rs. "
                           + groceryOrder.calculateBill());
    }
}
