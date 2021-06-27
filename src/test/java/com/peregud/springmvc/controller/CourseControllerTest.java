package com.peregud.springmvc.controller;

import com.peregud.springmvc.model.Course;
import com.peregud.springmvc.service.CourseService;
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

@WebMvcTest(CourseController.class)
class CourseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CourseService service;

    @Test
    void addCourse() throws Exception {
        List<Course> listCourses = new ArrayList<>();
        when(service.listAll()).thenReturn(listCourses);
        this.mockMvc.perform(get("/add-course")
                .contentType(MediaType.APPLICATION_JSON)
                .content(ControllerTestUtil.requestBody(listCourses)))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("course-table"))
                .andReturn();
    }

    @Test
    void getCourse() throws Exception {
        List<Course> listCourses = new ArrayList<>();
        when(service.listAll()).thenReturn(listCourses);
        this.mockMvc.perform(get("/get-course")
                .contentType(MediaType.APPLICATION_JSON)
                .content(ControllerTestUtil.requestBody(listCourses)))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("course-table"))
                .andReturn();
    }
}
