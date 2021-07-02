package com.peregud.inputdao.service;

import com.peregud.inputdao.model.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ServletStudentServiceTest {

    @Test
    void save() {
        ServletStudentService servletStudentService = mock(ServletStudentService.class);
        Student student = new Student();
        when(servletStudentService.save(any())).thenReturn(student);
        assertEquals(student, servletStudentService.save(student));
    }

    @Test
    void getById() {
        ServletStudentService servletStudentService = mock(ServletStudentService.class);
        Student student = new Student();
        when(servletStudentService.getById(any(Integer.class))).thenReturn(student);
        assertEquals(student, servletStudentService.getById(1));
    }

    @Test
    void getList() {
        ServletStudentService servletStudentService = mock(ServletStudentService.class);
        when(servletStudentService.getList()).thenReturn(new ArrayList<>());
        assertEquals(new ArrayList<>(), servletStudentService.getList());
    }
}
