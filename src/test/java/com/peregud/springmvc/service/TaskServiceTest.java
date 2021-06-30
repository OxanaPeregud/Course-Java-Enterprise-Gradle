package com.peregud.springmvc.service;

import com.peregud.springmvc.model.Task;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TaskServiceTest {

    @Test
    void listAll() {
        TaskService service = mock(TaskService.class);
        List<Task> list = new ArrayList<>();
        when(service.listAll()).thenReturn(list);
        assertEquals(list, service.listAll());
    }

    @Test
    void save() {
        TaskService service = mock(TaskService.class);
        Task task = new Task();
        when(service.save(task)).thenReturn(task);
        assertEquals(task, service.save(task));
    }
}
