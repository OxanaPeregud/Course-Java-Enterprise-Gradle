package com.peregud.inputdao.servlet;

import com.peregud.inputdao.dao.DAOCourse;
import com.peregud.inputdao.dao.DAOTeacher;
import com.peregud.inputdao.dao.impl.DAOCourseImpl;
import com.peregud.inputdao.dao.impl.DAOTeacherImpl;
import com.peregud.inputdao.model.Course;
import com.peregud.inputdao.model.Teacher;
import lombok.SneakyThrows;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/insert-teacher")
public class InsertTeacherServlet extends HttpServlet {
    private final DAOTeacher daoTeacher = new DAOTeacherImpl();
    private final DAOCourse daoCourse = new DAOCourseImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        int courseId = Integer.parseInt(request.getParameter("courseId"));
        Course course = daoCourse.getById(Course.class, courseId);
        Teacher teacher = new Teacher(firstName, lastName, course);
        daoTeacher.save(teacher);
        response.sendRedirect(request.getContextPath() + "/list-teachers");
    }
}
