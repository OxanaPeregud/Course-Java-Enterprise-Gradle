package com.peregud.inputdao.servlet;

import com.peregud.inputdao.dao.DAOCourse;
import com.peregud.inputdao.dao.impl.DAOCourseImpl;
import com.peregud.inputdao.model.Course;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update-course")
public class UpdateCourseServlet extends HttpServlet {
    private final DAOCourse daoCourse = new DAOCourseImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Course course = new Course(id, name);
        daoCourse.save(course);
        response.sendRedirect(request.getContextPath() + "/list-courses");
    }
}
