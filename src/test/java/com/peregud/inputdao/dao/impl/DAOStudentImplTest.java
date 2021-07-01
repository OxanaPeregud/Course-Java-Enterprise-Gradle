package com.peregud.inputdao.dao.impl;

import com.peregud.inputdao.model.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DAOStudentImplTest {

    @Test
    void save() {
        DAOStudentImpl daoStudent = mock(DAOStudentImpl.class);
        Student student = new Student();
        when(daoStudent.save(any())).thenReturn(student);
        assertEquals(student, daoStudent.save(student));
    }

    @Test
    @SuppressWarnings("unchecked")
    void getById() {
        DAOStudentImpl daoStudent = mock(DAOStudentImpl.class);
        Student student = new Student();
        when(daoStudent.getById(any(Class.class), any(Integer.class))).thenReturn(student);
        assertEquals(student, daoStudent.getById(Student.class,1));
    }

    @Test
    @SuppressWarnings("unchecked")
    void getAll() {
        DAOStudentImpl daoStudent = mock(DAOStudentImpl.class);
        List<?> list = new ArrayList<>();
        when(daoStudent.getAll(any(Class.class))).thenReturn(list);
        assertEquals(list, daoStudent.getAll(Student.class));
    }
}
