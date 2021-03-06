package com.peregud.inputdao.servlet;

import com.peregud.inputdao.service.ServletStudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list-students")
public class ListStudentsServlet extends HttpServlet {
    private final ServletStudentService servletStudentService = new ServletStudentService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<?> listStudents = servletStudentService.getList();
        request.setAttribute("listStudents", listStudents);
        request.getRequestDispatcher("view/students-list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        servletStudentService.deleteList(request.getParameterValues("deleteStudent"));
        List<?> listStudents = servletStudentService.getList();
        request.setAttribute("listStudents", listStudents);
        request.getRequestDispatcher("view/students-list.jsp").forward(request, response);
    }
}
