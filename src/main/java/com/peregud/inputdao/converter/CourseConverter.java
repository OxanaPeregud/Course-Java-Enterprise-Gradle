package com.peregud.inputdao.converter;

import com.peregud.inputdao.model.Course;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

public class CourseConverter implements Converter<Course> {

    @Override
    public Course convert(HttpServletRequest request) {
        Course.CourseBuilder builder = Course.builder();
        Optional.ofNullable(request.getParameter("id"))
                .map(Integer::parseInt)
                .ifPresent(builder::id);
        return builder
                .name(request.getParameter("name"))
                .build();
    }
}
