package com.peregud.inputdao.servlet;

import com.peregud.inputdao.service.ServletTeacherService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-teacher")
public class DeleteTeacherServlet extends HttpServlet {
    private final ServletTeacherService servletTeacherService = new ServletTeacherService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        servletTeacherService.delete(id);
        response.sendRedirect(request.getContextPath() + "/list-teachers");
    }
}
