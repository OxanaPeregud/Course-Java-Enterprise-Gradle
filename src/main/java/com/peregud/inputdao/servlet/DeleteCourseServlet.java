package com.peregud.inputdao.servlet;

import com.peregud.inputdao.dao.DAOCourse;
import com.peregud.inputdao.dao.impl.DAOCourseImpl;
import com.peregud.inputdao.model.Course;
import com.peregud.servletsdao.dao.BookDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-course")
public class DeleteCourseServlet extends HttpServlet {
    private final DAOCourse daoCourse = new DAOCourseImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        daoCourse.delete(Course.class, id);
        response.sendRedirect(request.getContextPath() + "/list-courses");
    }
}
