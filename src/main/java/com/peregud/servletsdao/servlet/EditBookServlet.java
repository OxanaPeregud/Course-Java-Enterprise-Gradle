package com.peregud.servletsdao.servlet;

import com.peregud.servletsdao.dao.BookDAO;
import com.peregud.servletsdao.model.Book;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/edit-book")
public class EditBookServlet extends HttpServlet {
    private final BookDAO bookDAO = new BookDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        Book existingBook = bookDAO.getById(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/book-form.jsp");
        request.setAttribute("book", existingBook);
        dispatcher.forward(request, response);
    }
}
