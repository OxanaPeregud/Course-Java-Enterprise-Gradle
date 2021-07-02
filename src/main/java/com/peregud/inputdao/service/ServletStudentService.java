package com.peregud.inputdao.service;

import com.peregud.inputdao.model.Student;

import java.util.List;

public class ServletStudentService extends ServletService<Student> {

    public List<?> getList() {
        return super.getAll(Student.class);
    }

    public void delete(int id) {
        super.delete(Student.class, id);
    }

    public void deleteList(String[] idList) {
        super.deleteList(Student.class, idList);
    }

    public Student save(Student student) {
        return super.save(student);
    }

    public Student getById(int id) {
        return super.getById(Student.class, id);
    }
}
