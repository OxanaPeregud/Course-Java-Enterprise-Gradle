package com.peregud.inputdao.dao.impl;

import com.peregud.inputdao.model.Course;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DAOCourseImplTest {

    @Test
    void save() {
        DAOCourseImpl daoCourse = mock(DAOCourseImpl.class);
        Course course = new Course();
        when(daoCourse.save(any())).thenReturn(course);
        assertEquals(course, daoCourse.save(course));
    }

    @Test
    @SuppressWarnings("unchecked")
    void getById() {
        DAOCourseImpl daoCourse = mock(DAOCourseImpl.class);
        Course course = new Course();
        when(daoCourse.getById(any(Class.class), any(Integer.class))).thenReturn(course);
        assertEquals(course, daoCourse.getById(Course.class,1));
    }

    @Test
    @SuppressWarnings("unchecked")
    void getAll() {
        DAOCourseImpl daoCourse = mock(DAOCourseImpl.class);
        List<?> list = new ArrayList<>();
        when(daoCourse.getAll(any(Class.class))).thenReturn(list);
        assertEquals(list, daoCourse.getAll(Course.class));
    }
}
