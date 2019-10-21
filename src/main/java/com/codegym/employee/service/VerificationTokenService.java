package com.codegym.employee.service;

import com.codegym.employee.model.VerificationToken;
import org.springframework.stereotype.Service;

@Service
public interface VerificationTokenService {
    VerificationToken findByToken(String token);

    void save(VerificationToken token);
}
