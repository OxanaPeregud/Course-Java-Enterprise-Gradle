package com.peregud.inputdao.servlet;

import com.peregud.inputdao.service.ServletCourseService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-course")
public class DeleteCourseServlet extends HttpServlet {
    private final ServletCourseService servletCourseService = new ServletCourseService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        servletCourseService.delete(id);
        response.sendRedirect(request.getContextPath() + "/list-courses");
    }
}
