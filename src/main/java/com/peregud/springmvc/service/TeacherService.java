package com.peregud.springmvc.service;

import com.peregud.springmvc.model.Teacher;
import com.peregud.springmvc.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TeacherService {

    @Autowired
    private TeacherRepository repo;

    public List<Teacher> listAll() {
        return repo.findAll();
    }

    public void save(Teacher teacher) {
        repo.save(teacher);
    }
}
