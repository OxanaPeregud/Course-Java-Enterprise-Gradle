package com.peregud.univeradmin.servlet;

import com.peregud.univeradmin.model.Admin;
import com.peregud.univeradmin.util.DataUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/university-get-admins-table")
public class GetAdminsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("admins", DataUtil.getAll(Admin.class));
        request.getRequestDispatcher("view/login-operations.jsp").include(request, response);
        request.getRequestDispatcher("view/university-admins-table.jsp").include(request,response);
    }
}
