package com.peregud.servletsdao.servlet;

import com.peregud.servletsdao.dao.BookDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-book")
public class DeleteBookServlet extends HttpServlet {
    private final BookDAO bookDAO = new BookDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        bookDAO.delete(id);
        response.sendRedirect(request.getContextPath() + "/list-books");
    }
}
