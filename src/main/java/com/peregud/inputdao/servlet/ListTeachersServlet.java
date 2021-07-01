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
import java.util.List;

@WebServlet("/list-teachers")
public class ListTeachersServlet extends HttpServlet {
    private final DAOTeacher daoTeacher = new DAOTeacherImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        List<?> listTeachers = daoTeacher.getAll(Teacher.class);
        request.setAttribute("listTeachers", listTeachers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/teachers-list.jsp");
        dispatcher.forward(request, response);
    }
}
