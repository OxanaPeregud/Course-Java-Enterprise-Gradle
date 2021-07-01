package com.peregud.inputdao.servlet;

import com.peregud.inputdao.dao.DAOTeacher;
import com.peregud.inputdao.dao.impl.DAOTeacherImpl;
import com.peregud.inputdao.model.Teacher;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-teacher")
public class DeleteTeacherServlet extends HttpServlet {
    private final DAOTeacher daoTeacher = new DAOTeacherImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        daoTeacher.delete(Teacher.class, id);
        response.sendRedirect(request.getContextPath() + "/list-teachers");
    }
}
