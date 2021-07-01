package com.peregud.inputdao.servlet;

import com.peregud.inputdao.dao.DAOStudent;
import com.peregud.inputdao.dao.impl.DAOStudentImpl;
import com.peregud.inputdao.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/edit-student")
public class EditStudentServlet extends HttpServlet {
    private final DAOStudent daoStudent = new DAOStudentImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        Student student = daoStudent.getById(Student.class, id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/student-form.jsp");
        request.setAttribute("student", student);
        dispatcher.forward(request, response);
    }
}
