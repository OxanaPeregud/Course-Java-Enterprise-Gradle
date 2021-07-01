package com.peregud.inputdao.dao.impl;

import com.peregud.inputdao.dao.AbstractDAO;
import com.peregud.inputdao.dao.DAOCourse;
import com.peregud.inputdao.model.Course;

import java.util.List;

public class DAOCourseImpl extends AbstractDAO<Course> implements DAOCourse {

    @Override
    public Course save(Course course) {
        return super.save(course);
    }

    @Override
    public Course getById(Class<Course> clazz, int id) {
        return super.getById(clazz, id);
    }

    @Override
    public void delete(Class<Course> clazz, int id) {
        super.delete(clazz, id);
    }

    @Override
    public List<?> getAll(Class<Course> clazz) {
        return super.getAll(clazz);
    }
}
