package com.peregud.springmvc.service;

import com.peregud.springmvc.model.StudentResult;
import com.peregud.springmvc.repository.StudentResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentResultService {

    @Autowired
    private StudentResultRepository repo;

    public List<StudentResult> listAll() {
        return repo.findAll();
    }

    public void save(StudentResult studentResult) {
        repo.save(studentResult);
    }
}
