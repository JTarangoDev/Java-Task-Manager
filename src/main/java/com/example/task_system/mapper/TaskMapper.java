package com.example.task_system.mapper;

import com.example.task_system.model.Task;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TaskMapper {

    @Select("SELECT * FROM tasks_db")
    List<Task> findAll();

    @Select("SELECT * FROM tasks_db WHERE id = #{id}")
    Task findTaskById(@Param("id") int id);

    @Insert("INSERT INTO tasks_db(id, name, description, date) VALUES (#{id}, #{name}, #{description}, #{date})")
    int setTask(Task task);

    @Delete("DELETE FROM tasks_db WHERE id = #{id}")
    int deleteTask(@Param("id") int id);
}
