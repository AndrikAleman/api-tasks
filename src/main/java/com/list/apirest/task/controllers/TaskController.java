package com.list.apirest.task.controllers;

import com.list.apirest.task.services.TaskServices;

import com.list.apirest.task.Entity.tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/task") //Esto es para este contenido se obtenga en este path
public class TaskController {
    private final TaskServices taskServices;      //Para crear una inyeccion

    @Autowired
    public TaskController(TaskServices taskServices) {  //Si aqui hay un error es por la anotacion Service
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
}
