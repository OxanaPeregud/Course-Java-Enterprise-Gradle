package com.peregud.springmvc.service;

import com.peregud.springmvc.model.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class StudentServiceTest {

    @Test
    void listAll() {
        StudentService service = mock(StudentService.class);
        List<Student> list = new ArrayList<>();
        when(service.listAll()).thenReturn(list);
        assertEquals(list, service.listAll());
    }

    @Test
    void save() {
        StudentService service = mock(StudentService.class);
        Student student = new Student();
        when(service.save(student)).thenReturn(student);
        assertEquals(student, service.save(student));
    }
}
