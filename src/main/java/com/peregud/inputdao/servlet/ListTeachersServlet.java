package com.peregud.inputdao.servlet;

import com.peregud.inputdao.service.ServletTeacherService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list-teachers")
public class ListTeachersServlet extends HttpServlet {
    private final ServletTeacherService servletTeacherService = new ServletTeacherService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<?> listTeachers = servletTeacherService.getList();
        request.setAttribute("listTeachers", listTeachers);
        request.getRequestDispatcher("view/teachers-list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        servletTeacherService.deleteList(request.getParameterValues("deleteTeacher"));
        List<?> listTeachers = servletTeacherService.getList();
        request.setAttribute("listTeachers", listTeachers);
        request.getRequestDispatcher("view/teachers-list.jsp").forward(request, response);
    }
}
