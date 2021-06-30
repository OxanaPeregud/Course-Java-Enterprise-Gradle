package com.peregud.springmvc.controller;

import com.peregud.springmvc.model.Student;
import com.peregud.springmvc.service.StudentService;
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

@WebMvcTest(StudentController.class)
class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StudentService service;

    @Test
    void addStudent() throws Exception {
        List<Student> listStudents = new ArrayList<>();
        when(service.listAll()).thenReturn(listStudents);
        this.mockMvc.perform(get("/add-student")
                .contentType(MediaType.APPLICATION_JSON)
                .content(ControllerTestUtil.requestBody(listStudents)))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("student-table"))
                .andReturn();
    }

    @Test
    void getStudent() throws Exception {
        List<Student> listStudents = new ArrayList<>();
        this.mockMvc.perform(get("/get-student")
                .contentType(MediaType.APPLICATION_JSON)
                .content(ControllerTestUtil.requestBody(listStudents)))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("student-table"))
                .andReturn();
    }
}
