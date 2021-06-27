package com.peregud.springmvc.service;

import com.peregud.springmvc.model.Course;
import com.peregud.springmvc.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseService {

    @Autowired
    private CourseRepository repo;

    public List<Course> listAll() {
        return repo.findAll();
    }

    public Course save(Course course) {
        return repo.save(course);
    }
}
