package org.example.Notification;

public class SmsService implements NotificationService {

    @Override 
    public  void sendNotification(){
        System.out.print("Sms notification sent");
    }
    
}
