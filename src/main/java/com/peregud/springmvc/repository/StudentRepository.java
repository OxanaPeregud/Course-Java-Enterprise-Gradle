package com.peregud.springmvc.repository;

import com.peregud.springmvc.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
