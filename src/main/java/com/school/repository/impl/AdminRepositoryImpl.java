package com.school.repository.impl;

import com.school.model.Admin;
import com.school.repository.AdminRepository;

import java.util.*;

public class AdminRepositoryImpl implements AdminRepository {

    private final Map<Long, Admin> storage = new HashMap<>();

    @Override
    public void save(Admin admin) {
        storage.put(admin.getId(), admin);
    }

    @Override
    public Admin findById(Long id) {
        return storage.get(id);
    }

    @Override
    public List<Admin> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void deleteById(Long id) {
        storage.remove(id);
    }

    @Override
    public void update(Admin admin) {
        storage.put(admin.getId(), admin);
    }
}
