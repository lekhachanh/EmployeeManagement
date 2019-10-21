package com.codegym.employee.service;

import com.codegym.employee.model.Role;

public interface RoleService {
    Role findRoleByName(String roleName);
}
