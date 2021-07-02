package com.peregud.inputdao.servlet;

import com.peregud.inputdao.model.Student;
import com.peregud.inputdao.service.ServletStudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/edit-student")
public class EditStudentServlet extends HttpServlet {
    private final ServletStudentService servletStudentService = new ServletStudentService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        Student student = servletStudentService.getById(id);
        request.setAttribute("student", student);
        request.getRequestDispatcher("view/student-form.jsp").forward(request, response);
    }
}
