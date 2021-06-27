package com.peregud.springmvc.controller;

import com.peregud.springmvc.model.Task;
import com.peregud.springmvc.service.TaskService;
import com.peregud.springmvc.util.DataGeneratorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping("/add-task")
    public String addTask(Model model) {
        service.save(DataGeneratorUtil.generateTask());
        List<Task> listTasks = service.listAll();
        model.addAttribute("listTasks", listTasks);
        return "task-table";
    }

    @GetMapping("/get-task")
    public String getTask(Model model) {
        List<Task> listTasks = service.listAll();
        model.addAttribute("listTasks", listTasks);
        return "task-table";
    }
}
