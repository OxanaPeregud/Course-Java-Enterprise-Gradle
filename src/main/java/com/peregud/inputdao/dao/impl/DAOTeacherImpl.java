package com.peregud.inputdao.dao.impl;

import com.peregud.inputdao.dao.AbstractDAO;
import com.peregud.inputdao.dao.DAOTeacher;
import com.peregud.inputdao.model.Teacher;

import java.util.List;

public class DAOTeacherImpl extends AbstractDAO<Teacher> implements DAOTeacher {

    @Override
    public Teacher save(Teacher teacher) {
        return super.save(teacher);
    }

    @Override
    public Teacher getById(Class<Teacher> clazz, int id) {
        return super.getById(clazz, id);
    }

    @Override
    public void delete(Class<Teacher> clazz, int id) {
        super.delete(clazz, id);
    }

    @Override
    public List<?> getAll(Class<Teacher> clazz) {
        return super.getAll(clazz);
    }
}
