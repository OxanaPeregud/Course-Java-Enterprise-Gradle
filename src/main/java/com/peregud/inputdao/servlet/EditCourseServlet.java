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

@WebServlet("/edit-course")
public class EditCourseServlet extends HttpServlet {
    private final DAOCourse daoCourse = new DAOCourseImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        Course course = daoCourse.getById(Course.class, id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/course-form.jsp");
        request.setAttribute("course", course);
        dispatcher.forward(request, response);
    }
}
