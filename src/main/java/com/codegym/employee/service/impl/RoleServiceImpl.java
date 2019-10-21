package com.codegym.employee.service.impl;

import com.codegym.employee.model.Role;
import com.codegym.employee.repository.RoleRepository;
import com.codegym.employee.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findRoleByName(String roleName) {
        return roleRepository.findRoleByName(roleName);
    }
}
