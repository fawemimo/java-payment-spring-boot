package com.excerise;

import org.aspectj.weaver.ast.Not;
import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email Called");
        System.out.println("Email Notification Service: " + message);
    }
}
