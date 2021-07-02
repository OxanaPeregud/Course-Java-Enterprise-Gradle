package com.peregud.inputdao.servlet;

import com.peregud.inputdao.converter.ConverterImpl;
import com.peregud.inputdao.model.Student;
import com.peregud.inputdao.service.ServletStudentService;
import lombok.SneakyThrows;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update-student")
public class UpdateStudentServlet extends HttpServlet {
    private final ServletStudentService servletStudentService = new ServletStudentService();

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Student student = (Student) ConverterImpl.getConverter(Student.class).convert(request);
        servletStudentService.save(student);
        response.sendRedirect(request.getContextPath() + "/list-students");
    }
}
