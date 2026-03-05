package com.excerise3;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryUserRepository implements UserRepository {
    Map<String , User> users = new HashMap<>();

    @Override
    public void save(User user) {
        System.out.println("Saving user: " + user);
        this.users.put(user.getEmail(), user);
        this.users.forEach((key,value) -> System.out.println(key + " : " + value));
    }

    @Override
    public User findByEmail(String email) {
        return users.getOrDefault(email, null);
    }


}
