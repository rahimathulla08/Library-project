package project;

class Payment {

    void pay(double amount) {
        System.out.println("Processing payment of Rs. " + amount);
    }
}

class CreditCardPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Payment of Rs. " + amount +
                           " made using Credit Card.");
    }
}

class UPIPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Payment of Rs. " + amount +
                           " made using UPI.");
    }
}

class NetBankingPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Payment of Rs. " + amount +
                           " made using Net Banking.");
    }
}

public class OnlinePaymentSystem {

    public static void main(String[] args) {

        Payment payment;

        payment = new CreditCardPayment();
        payment.pay(2500);

        payment = new UPIPayment();
        payment.pay(1500);

        payment = new NetBankingPayment();
        payment.pay(5000);
    }
}
