package com.peregud.springmvc.service;

import com.peregud.springmvc.model.Admin;
import com.peregud.springmvc.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminService {

    @Autowired
    private AdminRepository repo;

    public List<Admin> listAll() {
        return repo.findAll();
    }

    public void save(Admin admin) {
        repo.save(admin);
    }
}
