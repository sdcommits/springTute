package org.example;

import javax.management.Notification;

import org.example.Notification.EmailService;
import org.example.Notification.NotificationService;
import org.example.Notification.PopupNotification;

public class Main {
    public static void main(String[] args) {
        NotificationService notification = new PopupNotification();
       // OrderService order = new OrderService(notification);
       OrderService order = new OrderService();
       order.setNotification(notification);
        order.placeorder();
    }
}