package com.peregud.springmvc.repository;

import com.peregud.springmvc.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
