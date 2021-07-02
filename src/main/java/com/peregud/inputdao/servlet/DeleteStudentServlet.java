package com.peregud.inputdao.servlet;

import com.peregud.inputdao.service.ServletStudentService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-student")
public class DeleteStudentServlet extends HttpServlet {
    private final ServletStudentService servletStudentService = new ServletStudentService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        servletStudentService.delete(id);
        response.sendRedirect(request.getContextPath() + "/list-students");
    }
}
