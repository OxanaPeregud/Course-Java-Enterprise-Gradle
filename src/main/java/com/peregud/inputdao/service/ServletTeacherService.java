package com.peregud.inputdao.service;

import com.peregud.inputdao.model.Teacher;

import java.util.List;

public class ServletTeacherService extends ServletService<Teacher> {

    public List<?> getList() {
        return super.getAll(Teacher.class);
    }

    public void delete(int id) {
        super.delete(Teacher.class, id);
    }

    public void deleteList(String[] idList) {
        super.deleteList(Teacher.class, idList);
    }

    public Teacher save(Teacher teacher) {
        return super.save(teacher);
    }

    public Teacher getById(int id) {
        return super.getById(Teacher.class, id);
    }
}
