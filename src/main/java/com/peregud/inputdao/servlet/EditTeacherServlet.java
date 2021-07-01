package com.peregud.inputdao.servlet;

import com.peregud.inputdao.dao.DAOTeacher;
import com.peregud.inputdao.dao.impl.DAOTeacherImpl;
import com.peregud.inputdao.model.Teacher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/edit-teacher")
public class EditTeacherServlet extends HttpServlet {
    private final DAOTeacher daoTeacher = new DAOTeacherImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        Teacher teacher = daoTeacher.getById(Teacher.class, id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/teacher-form.jsp");
        request.setAttribute("teacher", teacher);
        dispatcher.forward(request, response);
    }
}
