package com.peregud.inputdao.dao.impl;

import com.peregud.inputdao.dao.AbstractDAO;
import com.peregud.inputdao.dao.DAOStudent;
import com.peregud.inputdao.model.Student;

import java.util.List;

public class DAOStudentImpl extends AbstractDAO<Student> implements DAOStudent {

    @Override
    public Student save(Student student) {
        return super.save(student);
    }

    @Override
    public Student getById(Class<Student> clazz, int id) {
        return super.getById(clazz, id);
    }

    @Override
    public void delete(Class<Student> clazz, int id) {
        super.delete(clazz, id);
    }

    @Override
    public List<?> getAll(Class<Student> clazz) {
        return super.getAll(clazz);
    }
}
