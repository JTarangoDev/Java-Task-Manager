package com.example.task_system.controller;

import com.example.task_system.exception.ResourceNotFoundException;
import com.example.task_system.model.Task;
import com.example.task_system.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class TaskController {

    @Autowired
    TaskService service;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/tareas")
    public String taskList(ModelMap model){
        List<Task> tasks = service.findAll();
        model.put("tasks", tasks);
        return "tareas";
    }

    @GetMapping("/agregar")
    public String showAdd(){
        return "agregar";
    }

    @PostMapping("/agregar")
    public String addTask(@ModelAttribute("taskForm") Task task){
        service.setTask(task);
        return "redirect:/tareas";
    }

    @GetMapping("/eliminar/{id}")
    public String deleteTask(@PathVariable("id") int id){
        Task task = service.findTaskById(id);
        if (task == null){
            throw new ResourceNotFoundException("Id Not Found: " + id);
        }
        service.deleteTask(id);
        return "redirect:/tareas";
    }

}
