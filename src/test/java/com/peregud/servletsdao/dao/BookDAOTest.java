package com.peregud.servletsdao.dao;

import com.peregud.servletsdao.model.Book;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookDAOTest {

    @Test
    void save() {
        BookDAO bookDAO = mock(BookDAO.class);
        Book book = new Book();
        when(bookDAO.save(any())).thenReturn(book);
        assertEquals(book, bookDAO.save(book));
    }

    @Test
    void getAll() {
        BookDAO bookDAO = mock(BookDAO.class);
        List<?> list = new ArrayList<>();
        when(bookDAO.getAll()).thenReturn(new ArrayList<>());
        assertEquals(list, bookDAO.getAll());
    }

    @Test
    void getById() {
        BookDAO bookDAO = mock(BookDAO.class);
        Book book = new Book();
        when(bookDAO.getById(any(Integer.class))).thenReturn(book);
        assertEquals(book, bookDAO.getById(1));
    }
}
