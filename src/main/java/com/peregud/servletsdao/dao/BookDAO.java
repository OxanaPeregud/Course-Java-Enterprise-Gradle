package com.peregud.servletsdao.dao;

import com.peregud.servletsdao.util.HibernateUtil;
import com.peregud.servletsdao.model.Book;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public Book save(Book book) {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(book);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
        return book;
    }

    public List<?> getAll() {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        List<?> list = new ArrayList<>();
        try {
            entityManager.getTransaction().begin();
            list = entityManager
                    .createQuery("FROM Book")
                    .getResultList();
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
        return list;
    }

    public void delete(int id) {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.createQuery("DELETE FROM Book WHERE id = :bookId")
                    .setParameter("bookId", id)
                    .executeUpdate();
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
    }

    public Book getById(int id) {
        Book book = new Book();
        EntityManager entityManager = HibernateUtil.createEntityManager();
        try {
            book = entityManager.find(Book.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
        return book;
    }
}
