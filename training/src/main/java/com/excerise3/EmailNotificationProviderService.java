package com.excerise3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationProviderService implements NotificationInterface {

    @Value("${email.host}")
    private String host;

    @Value("${email.name}")
    private String emailName;

    @Value("${email.port}")
    private String port;

    @Value("${email.ssl}")
    private String ssl;

    @Override
    public void send(String message, String recipientEmail) {

        System.out.println("Email host: " + host);
        System.out.println("Email name: " + emailName);
        System.out.println("Email port: " + port);
        System.out.println("Email ssl: " + ssl);
        System.out.println("Sending this " + message + " to " + recipientEmail);
    }
}
