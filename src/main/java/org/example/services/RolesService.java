package org.example.services;

import org.example.daos.RolesDao;
import org.example.models.Role;

import java.sql.SQLException;
import java.util.List;

public class RolesService {
    RolesDao roleDao;
    public RolesService(final RolesDao roleDao) {
        this.roleDao = roleDao;
    }

    public List<Role> getAllRoles() throws SQLException {
        return roleDao.getAllRoles();
    }
}
