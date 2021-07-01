package com.peregud.inputdao.servlet;

import com.peregud.inputdao.dao.DAOStudent;
import com.peregud.inputdao.dao.impl.DAOStudentImpl;
import com.peregud.inputdao.model.Student;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/insert-student")
public class InsertStudentServlet extends HttpServlet {
    private final DAOStudent daoStudent = new DAOStudentImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        Student student = new Student(firstName, lastName);
        daoStudent.save(student);
        response.sendRedirect(request.getContextPath() + "/list-students");
    }
}
