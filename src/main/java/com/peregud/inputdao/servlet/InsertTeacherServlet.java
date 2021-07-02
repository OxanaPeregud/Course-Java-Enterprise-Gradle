package com.peregud.inputdao.servlet;

import com.peregud.inputdao.converter.ConverterImpl;
import com.peregud.inputdao.model.Teacher;
import com.peregud.inputdao.service.ServletTeacherService;
import lombok.SneakyThrows;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/insert-teacher")
public class InsertTeacherServlet extends HttpServlet {
    private final ServletTeacherService servletTeacherService = new ServletTeacherService();

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Teacher teacher = (Teacher) ConverterImpl.getConverter(Teacher.class).convert(request);
        servletTeacherService.save(teacher);
        response.sendRedirect(request.getContextPath() + "/list-teachers");
    }
}
