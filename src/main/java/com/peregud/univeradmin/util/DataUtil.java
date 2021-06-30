package com.peregud.univeradmin.util;

import lombok.experimental.UtilityClass;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class DataUtil {

    public static <T> void saveData(List<T> list) {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            list.forEach(entityManager::merge);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
    }

    public static <T> List<?> getAll(Class<T> clazz) {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        List<?> list = new ArrayList<>();
        try {
            entityManager.getTransaction().begin();
            list = entityManager
                    .createQuery("FROM " + clazz.getName())
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

    public static <T> T get(Class<T> clazz, int id) {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        T t = null;
        try {
            t = entityManager.find(clazz, id);
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return t;
    }
}
