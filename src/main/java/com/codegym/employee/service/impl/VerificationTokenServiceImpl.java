package com.codegym.employee.service.impl;

import com.codegym.employee.model.VerificationToken;
import com.codegym.employee.repository.VerificationTokenRepository;
import com.codegym.employee.service.VerificationTokenService;
import org.springframework.beans.factory.annotation.Autowired;

public class VerificationTokenServiceImpl implements VerificationTokenService {
    @Autowired
    private VerificationTokenRepository verificationTokenRepository;

    @Override
    public VerificationToken findByToken(String token) {
        return verificationTokenRepository.findByToken(token);
    }

    @Override
    public void save(VerificationToken token) {
        verificationTokenRepository.save(token);
    }
}
