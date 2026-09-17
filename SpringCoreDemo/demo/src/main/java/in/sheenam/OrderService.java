package main.java.in.sheenam;

public class OrderService {

    private paymentSevice paymentservice;
    public OrderService(paymentSevice paymentsevice){
        this.paymentservice = paymentsevice;
    }
    public void placeOrder(){
        paymentservice.pay();
        System.out.print("Order Placed");
    } 
}
