package com.peregud.springmvc.repository;

import com.peregud.springmvc.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
