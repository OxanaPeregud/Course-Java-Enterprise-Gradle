package com.peregud.inputdao.servlet;

import com.peregud.inputdao.dao.DAOCourse;
import com.peregud.inputdao.dao.DAOStudent;
import com.peregud.inputdao.dao.impl.DAOCourseImpl;
import com.peregud.inputdao.dao.impl.DAOStudentImpl;
import com.peregud.inputdao.model.Course;
import com.peregud.inputdao.model.Student;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/insert-student")
public class InsertStudentServlet extends HttpServlet {
    private final DAOStudent daoStudent = new DAOStudentImpl();
    private final DAOCourse daoCourse = new DAOCourseImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        int courseId = Integer.parseInt(request.getParameter("courseId"));
        Course course = daoCourse.getById(Course.class, courseId);
        Student student = new Student(firstName, lastName, course);
        daoStudent.save(student);
        response.sendRedirect(request.getContextPath() + "/list-students");
    }
}
