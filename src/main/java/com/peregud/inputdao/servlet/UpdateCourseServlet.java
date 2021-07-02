package com.peregud.inputdao.servlet;

import com.peregud.inputdao.converter.ConverterImpl;
import com.peregud.inputdao.model.Course;
import com.peregud.inputdao.service.ServletCourseService;
import lombok.SneakyThrows;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update-course")
public class UpdateCourseServlet extends HttpServlet {
    private final ServletCourseService servletCourseService = new ServletCourseService();

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Course course = (Course) ConverterImpl.getConverter(Course.class).convert(request);
        servletCourseService.save(course);
        response.sendRedirect(request.getContextPath() + "/list-courses");
    }
}
