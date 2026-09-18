package main.java.in.sheenam;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    // private paymentSevice paymentservice;
    // public OrderService(paymentSevice paymentsevice){
    //     this.paymentservice = paymentsevice;
    // }


    public void placeOrder(){
        //paymentservice.pay();
        System.out.print("Order Placed");
    } 
}
