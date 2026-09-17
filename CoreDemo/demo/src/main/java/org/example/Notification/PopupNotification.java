package org.example.Notification;

public class PopupNotification implements NotificationService{

    @Override 
    public void sendNotification(){
        System.out.print("Pop-up notification sent");
    }  
}
