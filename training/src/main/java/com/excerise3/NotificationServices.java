package com.excerise3;

import org.springframework.stereotype.Service;

@Service
public class NotificationServices implements NotificationInterface {

    private final EmailNotificationProviderService emailNotificationProviderService;

    public NotificationServices(EmailNotificationProviderService emailNotificationProviderService) {
        this.emailNotificationProviderService = emailNotificationProviderService;
    }
    @Override
    public void send(String message, String receiverEmail) {
        emailNotificationProviderService.send(message, receiverEmail);;

    }
}
