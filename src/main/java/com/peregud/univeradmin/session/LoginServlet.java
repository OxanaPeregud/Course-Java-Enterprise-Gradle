package com.peregud.univeradmin.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("view/login-operations.jsp").include(request, response);
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        if (password.equals("1234")) {
            out.print("Hello, " + name);
            HttpSession session = request.getSession();
            session.setAttribute("name", name);
            request.getRequestDispatcher("view/university-select-table.jsp").include(request, response);
        } else {
            out.print("Incorrect username or password!");
            request.getRequestDispatcher("view/login.jsp").include(request, response);
        }
        out.close();
    }
}
