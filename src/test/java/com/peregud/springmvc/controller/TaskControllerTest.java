package com.peregud.springmvc.controller;

import com.peregud.springmvc.model.Task;
import com.peregud.springmvc.service.TaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TaskController.class)
class TaskControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TaskService service;

    @Test
    void addTask() throws Exception {
        List<Task> listTasks = new ArrayList<>();
        when(service.listAll()).thenReturn(listTasks);
        this.mockMvc.perform(get("/add-task")
                .contentType(MediaType.APPLICATION_JSON)
                .content(ControllerTestUtil.requestBody(listTasks)))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("task-table"))
                .andReturn();
    }

    @Test
    void getTask() throws Exception {
        List<Task> listTasks = new ArrayList<>();
        when(service.listAll()).thenReturn(listTasks);
        this.mockMvc.perform(get("/get-task")
                .contentType(MediaType.APPLICATION_JSON)
                .content(ControllerTestUtil.requestBody(listTasks)))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("task-table"))
                .andReturn();
    }
}
