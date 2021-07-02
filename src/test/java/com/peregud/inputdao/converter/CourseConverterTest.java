package com.peregud.inputdao.converter;

import com.peregud.inputdao.model.Course;
import org.junit.jupiter.api.Test;

import javax.servlet.http.HttpServletRequest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class CourseConverterTest {
    CourseConverter courseConverter = new CourseConverter();

    @Test
    void convert() {
        HttpServletRequest request = mock(HttpServletRequest.class);
        Course course = Course.builder().build();
        assertEquals(course, courseConverter.convert(request));
    }
}