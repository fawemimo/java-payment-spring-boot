package com.excerise3;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class User {
    private Long id;
    private String email;
    private String password;
    private String name;

//    default constructor
    public User() {
        this.id = System.currentTimeMillis();
        this.email = "success.abhishek@interswitchng.com";
        this.password = "M0Nd&$@1234";
        this.name = "Chika Success";
    }

    public User(String email, String password, String name) {
        this.id = System.currentTimeMillis();
        setEmail(email);
        this.password = password;
        this.name = name;
    }

    public void setEmail(String email) {
        if ( email.split("@").length == 1) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return this.id + " : " + this.email + " : " + this.password + " : " + this.name;
    }
}
