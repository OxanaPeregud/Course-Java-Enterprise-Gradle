package com.peregud.inputdao.converter;

import com.peregud.inputdao.dao.DAOCourse;
import com.peregud.inputdao.dao.impl.DAOCourseImpl;
import com.peregud.inputdao.model.Course;
import com.peregud.inputdao.model.Student;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

public class StudentConverter implements Converter<Student> {
    private final DAOCourse daoCourse = new DAOCourseImpl();

    @Override
    public Student convert(HttpServletRequest request) {
        int courseId = Integer.parseInt(request.getParameter("courseId"));
        Course course = daoCourse.getById(Course.class, courseId);
        Student.StudentBuilder builder = Student.builder();
        Optional.ofNullable(request.getParameter("id"))
                .map(Integer::parseInt)
                .ifPresent(builder::id);
        return builder
                .firstName(request.getParameter("firstName"))
                .lastName(request.getParameter("lastName"))
                .course(course)
                .build();
    }
}
