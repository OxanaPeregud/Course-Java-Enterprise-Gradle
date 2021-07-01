package com.peregud.inputdao.servlet;

import com.peregud.inputdao.dao.DAOCourse;
import com.peregud.inputdao.dao.impl.DAOCourseImpl;
import com.peregud.inputdao.model.Course;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list-courses")
public class ListCoursesServlet extends HttpServlet {
    private final DAOCourse daoCourse = new DAOCourseImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        List<?> listCourses = daoCourse.getAll(Course.class);
        request.setAttribute("listCourses", listCourses);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/courses-list.jsp");
        dispatcher.forward(request, response);
    }
}
