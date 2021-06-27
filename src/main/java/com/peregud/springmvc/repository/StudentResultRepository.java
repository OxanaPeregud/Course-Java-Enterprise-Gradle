package com.peregud.springmvc.repository;

import com.peregud.springmvc.model.StudentResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentResultRepository extends JpaRepository<StudentResult, Long> {
}
