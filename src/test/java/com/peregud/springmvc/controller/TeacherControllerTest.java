package com.peregud.springmvc.controller;

import com.peregud.springmvc.model.Teacher;
import com.peregud.springmvc.service.TeacherService;
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

@WebMvcTest(TeacherController.class)
class TeacherControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TeacherService service;

    @Test
    void addTeacher() throws Exception {
        List<Teacher> listTeachers = new ArrayList<>();
        when(service.listAll()).thenReturn(listTeachers);
        this.mockMvc.perform(get("/add-teacher")
                .contentType(MediaType.APPLICATION_JSON)
                .content(ControllerTestUtil.requestBody(listTeachers)))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("teacher-table"))
                .andReturn();
    }

    @Test
    void getTeacher() throws Exception {
        List<Teacher> listTeachers = new ArrayList<>();
        when(service.listAll()).thenReturn(listTeachers);
        this.mockMvc.perform(get("/get-teacher")
                .contentType(MediaType.APPLICATION_JSON)
                .content(ControllerTestUtil.requestBody(listTeachers)))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("teacher-table"))
                .andReturn();
    }
}
