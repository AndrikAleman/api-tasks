package com.list.apirest.task.services;

import com.list.apirest.task.DAO.TaskRepository;
import com.list.apirest.task.Entity.tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service    //This annotation is so important
public class TaskServices {
    //Element Injection
    private final TaskRepository taskRepository;

    @Autowired
    public TaskServices(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<tasks> getTasks(){
        return this.taskRepository.findAll();
    }

    //We create the class to save
    public void newTask(tasks task){
        taskRepository.save(task);
    }

    //We create the class to delete
    public void deleteTask(tasks task){
        taskRepository.delete(task);
    }

    //We create the class to update
    public void updateTask(tasks task){
        taskRepository.save(task);
    }
}
