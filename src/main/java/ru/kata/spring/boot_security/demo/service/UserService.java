package ru.kata.spring.boot_security.demo.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    void addUser(User user, String[] role);

    List<User> getAllUsers();

    User getUserById(int id);

    User getUserByUsername(String username);

    void editUser(User user, String[] role);

    void deleteUser(int id);
}
