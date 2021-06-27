package com.peregud.springmvc.controller;

import com.peregud.springmvc.model.Student;
import com.peregud.springmvc.service.StudentService;
import com.peregud.springmvc.util.DataGeneratorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/add-student")
    public String addStudent(Model model) {
        service.save(DataGeneratorUtil.generateStudent());
        List<Student> listStudents = service.listAll();
        model.addAttribute("listStudents", listStudents);
        return "student-table";
    }

    @GetMapping("/get-student")
    public String getStudent(Model model) {
        List<Student> listStudents = service.listAll();
        model.addAttribute("listStudents", listStudents);
        return "student-table";
    }
}
