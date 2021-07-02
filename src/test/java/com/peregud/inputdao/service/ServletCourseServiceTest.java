package com.peregud.inputdao.service;

import com.peregud.inputdao.model.Course;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ServletCourseServiceTest {

    @Test
    void save() {
        ServletCourseService servletCourseService = mock(ServletCourseService.class);
        Course course = new Course();
        when(servletCourseService.save(any())).thenReturn(course);
        assertEquals(course, servletCourseService.save(course));
    }

    @Test
    void getById() {
        ServletCourseService servletCourseService = mock(ServletCourseService.class);
        Course course = new Course();
        when(servletCourseService.getById(any(Integer.class))).thenReturn(course);
        assertEquals(course, servletCourseService.getById(1));
    }

    @Test
    void getList() {
        ServletCourseService servletCourseService = mock(ServletCourseService.class);
        when(servletCourseService.getList()).thenReturn(new ArrayList<>());
        assertEquals(new ArrayList<>(), servletCourseService.getList());
    }
}
