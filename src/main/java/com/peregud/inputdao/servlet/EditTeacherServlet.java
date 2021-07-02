package com.peregud.inputdao.servlet;

import com.peregud.inputdao.model.Teacher;
import com.peregud.inputdao.service.ServletTeacherService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/edit-teacher")
public class EditTeacherServlet extends HttpServlet {
    private final ServletTeacherService servletTeacherService = new ServletTeacherService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        Teacher teacher = servletTeacherService.getById(id);
        request.setAttribute("teacher", teacher);
        request.getRequestDispatcher("view/teacher-form.jsp").forward(request, response);
    }
}
