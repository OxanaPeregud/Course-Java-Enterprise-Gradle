package com.peregud.springmvc.controller;

import com.peregud.springmvc.model.StudentResult;
import com.peregud.springmvc.service.StudentResultService;
import com.peregud.springmvc.util.DataGeneratorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentResultController {

    @Autowired
    private StudentResultService service;

    @GetMapping("/add-student-result")
    public String addStudentResult(Model model) {
        service.save(DataGeneratorUtil.generateStudentResult());
        List<StudentResult> listStudentResults = service.listAll();
        model.addAttribute("listStudentResults", listStudentResults);
        return "student-result-table";
    }

    @GetMapping("/get-student-result")
    public String getStudentResult(Model model) {
        List<StudentResult> listStudentResults = service.listAll();
        model.addAttribute("listStudentResults", listStudentResults);
        return "student-result-table";
    }
}
