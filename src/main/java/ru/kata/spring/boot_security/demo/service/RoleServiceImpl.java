package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.dao.RoleDao;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Role> getAllRoles() {
        return roleDao.getAllRoles();
    }

    @Transactional(readOnly = true)
    @Override
    public Role getRoleById(int id) {
        return roleDao.getRoleById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public Role getRoleByName(String name) {
        return roleDao.getRoleByName(name);
    }

    @Transactional
    @Override
    public void addRole(Role role) {
        roleDao.addRole(role);
    }
}
