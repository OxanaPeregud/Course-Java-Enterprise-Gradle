package com.peregud.springmvc.service;

import com.peregud.springmvc.model.Course;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CourseServiceTest {

    @Test
    void listAll() {
        CourseService service = mock(CourseService.class);
        List<Course> list = new ArrayList<>();
        when(service.listAll()).thenReturn(list);
        assertEquals(list, service.listAll());
    }

    @Test
    void save() {
        CourseService service = mock(CourseService.class);
        Course course = new Course();
        when(service.save(course)).thenReturn(course);
        assertEquals(course, service.save(course));
    }
}
