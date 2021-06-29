package com.peregud.servletsdao.servlet;

import com.peregud.servletsdao.dao.BookDAO;
import com.peregud.servletsdao.model.Book;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update-book")
public class UpdateBookServlet extends HttpServlet {
    private final BookDAO bookDAO = new BookDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        float price = Float.parseFloat(request.getParameter("price"));
        Book book = new Book(id, title, author, price);
        bookDAO.save(book);
        response.sendRedirect(request.getContextPath() + "/list-books");
    }
}
