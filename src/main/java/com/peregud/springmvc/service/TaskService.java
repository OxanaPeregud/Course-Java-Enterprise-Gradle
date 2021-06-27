package com.peregud.springmvc.service;

import com.peregud.springmvc.model.Task;
import com.peregud.springmvc.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TaskService {

    @Autowired
    private TaskRepository repo;

    public List<Task> listAll() {
        return repo.findAll();
    }

    public Task save(Task task) {
        return repo.save(task);
    }
}
