package in.sheenam;

import main.java.in.sheenam.OrderService;
import main.java.in.sheenam.paymentSevice;

public class Main {
    public static void main(String[] args) {

        paymentSevice service = new paymentSevice();
        OrderService order = new OrderService(service);
        order.placeOrder();
        // System.out.println("Hello world!");
    }
}