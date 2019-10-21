package com.codegym.employee.service;

import com.codegym.employee.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface UserService extends UserDetailsService {
    void save (User user);
    Iterable<User> findAll();
    Optional<User> findById(Long id);
    boolean checkLogin(User user);
    User findByUsername(String username);
    boolean isRegister(User user);
    User getCurrentUser();
}
