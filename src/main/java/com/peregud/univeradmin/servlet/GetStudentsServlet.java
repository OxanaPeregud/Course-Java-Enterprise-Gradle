package com.peregud.univeradmin.servlet;

import com.peregud.univeradmin.model.Student;
import com.peregud.univeradmin.util.DataUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/university-get-students-table")
public class GetStudentsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("students", DataUtil.getAll(Student.class));
        request.getRequestDispatcher("view/university-students-table.jsp").forward(request,response);
    }
}
