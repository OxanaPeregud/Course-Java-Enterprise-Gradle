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
import java.util.List;

@WebServlet("/list-students")
public class ListStudentsServlet extends HttpServlet {
    private final DAOStudent daoStudent = new DAOStudentImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        List<?> listStudents = daoStudent.getAll(Student.class);
        request.setAttribute("listStudents", listStudents);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/students-list.jsp");
        dispatcher.forward(request, response);
    }
}
