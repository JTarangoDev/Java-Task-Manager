package com.example.task_system.service;

import com.example.task_system.mapper.TaskMapper;
import com.example.task_system.model.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService implements ITaskService{

    private final TaskMapper mapper;

    @Override
    public List<Task> findAll() {
        return mapper.findAll();
    }

    @Override
    public Task findTaskById(int id) {
        return mapper.findTaskById(id);
    }

    @Override
    public int setTask(Task task) {
        return mapper.setTask(task);
    }

    @Override
    public int deleteTask(int id) {
        return mapper.deleteTask(id);
    }
}
