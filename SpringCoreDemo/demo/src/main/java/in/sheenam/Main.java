package in.sheenam;

import main.java.in.sheenam.AppConfig;
import main.java.in.sheenam.OrderService;
import main.java.in.sheenam.paymentSevice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();



    }
}