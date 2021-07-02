package com.peregud.inputdao.dao.impl;

import com.peregud.inputdao.model.Teacher;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DAOTeacherImplTest {

    @Test
    void save() {
        DAOTeacherImpl daoTeacher = mock(DAOTeacherImpl.class);
        Teacher teacher = new Teacher();
        when(daoTeacher.save(any())).thenReturn(teacher);
        assertEquals(teacher, daoTeacher.save(teacher));
    }

    @Test
    @SuppressWarnings("unchecked")
    void getById() {
        DAOTeacherImpl daoTeacher = mock(DAOTeacherImpl.class);
        Teacher teacher = new Teacher();
        when(daoTeacher.getById(any(Class.class), any(Integer.class))).thenReturn(teacher);
        assertEquals(teacher, daoTeacher.getById(Teacher.class,1));
    }

    @Test
    @SuppressWarnings("unchecked")
    void getAll() {
        DAOTeacherImpl daoTeacher = mock(DAOTeacherImpl.class);
        List<?> list = new ArrayList<>();
        when(daoTeacher.getAll(any(Class.class))).thenReturn(list);
        assertEquals(list, daoTeacher.getAll(Teacher.class));
    }
}
