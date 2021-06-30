package com.peregud.springmvc.controller;

import com.peregud.springmvc.model.Course;
import com.peregud.springmvc.service.CourseService;
import com.peregud.springmvc.util.DataGeneratorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping("/add-course")
    public String addCourse(Model model) {
        service.save(DataGeneratorUtil.generateCourse());
        List<?> listCourses = service.listAll();
        model.addAttribute("listCourses", listCourses);
        return "course-table";
    }

    @GetMapping("/get-course")
    public String getCourse(Model model) {
        List<Course> listCourses = service.listAll();
        model.addAttribute("listCourses", listCourses);
        return "course-table";
    }
}
