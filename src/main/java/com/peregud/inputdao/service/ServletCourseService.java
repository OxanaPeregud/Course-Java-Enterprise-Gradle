package com.peregud.inputdao.service;

import com.peregud.inputdao.model.Course;

import java.util.List;

public class ServletCourseService extends ServletService<Course> {

    public List<?> getList() {
        return super.getAll(Course.class);
    }

    public void delete(int id) {
        super.delete(Course.class, id);
    }

    public void deleteList(String[] idList) {
        super.deleteList(Course.class, idList);
    }

    public Course save(Course course) {
        return super.save(course);
    }

    public Course getById(int id) {
        return super.getById(Course.class, id);
    }
}
