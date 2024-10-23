package com.list.apirest.task.controllers;

import com.list.apirest.task.services.TaskServices;

import com.list.apirest.task.Entity.tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/task") //This is for this content to be obtained in this path
public class TaskController {
    private final TaskServices taskServices;      //To create an injection

    @Autowired
    public TaskController(TaskServices taskServices) {  //If there is an error here, it is because of the Service annotation
        this.taskServices = taskServices;
    }

    @GetMapping
    public List<tasks> getTasks() {
        return taskServices.getTasks();
    }

    //Guardar tarea o registrar
    //1- before, create a class newTask in service
    @PostMapping
    public void postTask(@RequestBody tasks task) {
        this.taskServices.newTask(task);
    }

    @DeleteMapping
    public void deleteTask(@RequestBody tasks task) {
        this.taskServices.deleteTask(task);
    }

    @PutMapping
    public void updateTask(@RequestBody tasks task) {
        this.taskServices.updateTask(task);
    }
}
