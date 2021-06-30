package com.peregud.springmvc.service;

import com.peregud.springmvc.model.StudentResult;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class StudentResultServiceTest {

    @Test
    void listAll() {
        StudentResultService service = mock(StudentResultService.class);
        List<StudentResult> list = new ArrayList<>();
        when(service.listAll()).thenReturn(list);
        assertEquals(list, service.listAll());
    }

    @Test
    void save() {
        StudentResultService service = mock(StudentResultService.class);
        StudentResult studentResult = new StudentResult();
        when(service.save(studentResult)).thenReturn(studentResult);
        assertEquals(studentResult, service.save(studentResult));
    }
}
