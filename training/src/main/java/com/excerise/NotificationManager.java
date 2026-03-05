package com.excerise;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager {
    private NotificationService notificationService;


    public NotificationManager( NotificationService notificationService) {
        setNotificationService(notificationService);
    }

    public void sendNotification(String message){
        notificationService.send(message);
    }

//    setter for the notification
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
