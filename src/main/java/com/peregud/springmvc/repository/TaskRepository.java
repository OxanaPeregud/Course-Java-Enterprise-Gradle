package com.peregud.springmvc.repository;

import com.peregud.springmvc.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
