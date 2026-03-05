package com.excerise3;

public interface UserRepository {

    void save(User user);
    User findByEmail(String email);
}
