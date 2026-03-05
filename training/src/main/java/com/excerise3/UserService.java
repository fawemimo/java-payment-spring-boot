package com.excerise3;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final NotificationServices notificationServices;

    public UserService(UserRepository userRepository, NotificationServices notificationServices) {
        this.userRepository = userRepository;
        this.notificationServices = notificationServices;
    }

    public void registerUser(User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new IllegalArgumentException("User already exists: "+ user.getEmail());
        }
        userRepository.save(user);
        this.notificationServices.send("Registered User", user.getEmail());
    }
}
