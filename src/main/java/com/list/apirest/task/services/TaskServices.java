package com.list.apirest.task.services;

import com.list.apirest.task.DAO.TaskRepository;
import com.list.apirest.task.tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service    //This annotation is so important
public class TaskServices {
    //Inyeccion de elementos
    private final TaskRepository taskRepository;

    @Autowired
    public TaskServices(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<tasks> getTasks(){
        return this.taskRepository.findAll();
    }
}
