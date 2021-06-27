package com.peregud.springmvc.service;

import com.peregud.springmvc.model.Teacher;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TeacherServiceTest {

    @Test
    void listAll() {
        TeacherService service = mock(TeacherService.class);
        List<Teacher> list = new ArrayList<>();
        when(service.listAll()).thenReturn(list);
        assertEquals(list, service.listAll());
    }

    @Test
    void save() {
        TeacherService service = mock(TeacherService.class);
        Teacher teacher = new Teacher();
        when(service.save(teacher)).thenReturn(teacher);
        assertEquals(teacher, service.save(teacher));
    }
}
