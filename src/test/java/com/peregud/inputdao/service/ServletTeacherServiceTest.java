package com.peregud.inputdao.service;

import com.peregud.inputdao.model.Teacher;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ServletTeacherServiceTest {

    @Test
    void save() {
        ServletTeacherService servletTeacherService = mock(ServletTeacherService.class);
        Teacher teacher = new Teacher();
        when(servletTeacherService.save(any())).thenReturn(teacher);
        assertEquals(teacher, servletTeacherService.save(teacher));
    }

    @Test
    void getById() {
        ServletTeacherService servletTeacherService = mock(ServletTeacherService.class);
        Teacher teacher = new Teacher();
        when(servletTeacherService.getById(any(Integer.class))).thenReturn(teacher);
        assertEquals(teacher, servletTeacherService.getById(1));
    }

    @Test
    void getList() {
        ServletTeacherService servletTeacherService = mock(ServletTeacherService.class);
        when(servletTeacherService.getList()).thenReturn(new ArrayList<>());
        assertEquals(new ArrayList<>(), servletTeacherService.getList());
    }
}
