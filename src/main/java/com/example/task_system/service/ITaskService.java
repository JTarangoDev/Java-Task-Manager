package com.example.task_system.service;

import com.example.task_system.model.Task;

import java.util.List;

public interface ITaskService {

    List<Task> findAll();

    Task findTaskById(int id);

    int setTask(Task task);

    int deleteTask(int id);
}
