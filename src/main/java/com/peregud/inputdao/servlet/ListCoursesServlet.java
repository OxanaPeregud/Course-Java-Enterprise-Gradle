package com.peregud.inputdao.servlet;

import com.peregud.inputdao.service.ServletCourseService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list-courses")
public class ListCoursesServlet extends HttpServlet {
    private final ServletCourseService servletCourseService = new ServletCourseService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<?> listCourses = servletCourseService.getList();
        request.setAttribute("listCourses", listCourses);
        request.getRequestDispatcher("view/courses-list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        servletCourseService.deleteList(request.getParameterValues("deleteCourse"));
        List<?> listCourses = servletCourseService.getList();
        request.setAttribute("listCourses", listCourses);
        request.getRequestDispatcher("view/courses-list.jsp").forward(request, response);
    }
}
