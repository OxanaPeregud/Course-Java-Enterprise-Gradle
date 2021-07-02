package com.peregud.inputdao.servlet;

import com.peregud.inputdao.model.Course;
import com.peregud.inputdao.service.ServletCourseService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/edit-course")
public class EditCourseServlet extends HttpServlet {
    private final ServletCourseService servletCourseService = new ServletCourseService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        Course course = servletCourseService.getById(id);
        request.setAttribute("course", course);
        request.getRequestDispatcher("view/course-form.jsp").forward(request, response);
    }
}
