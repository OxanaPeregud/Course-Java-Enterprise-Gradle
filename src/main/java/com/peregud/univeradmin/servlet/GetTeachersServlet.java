package com.peregud.univeradmin.servlet;

import com.peregud.univeradmin.model.Teacher;
import com.peregud.univeradmin.util.DataUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/university-get-teachers-table")
public class GetTeachersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("teachers", DataUtil.getAll(Teacher.class));
        request.getRequestDispatcher("view/university-teachers-table.jsp").forward(request,response);
    }
}
