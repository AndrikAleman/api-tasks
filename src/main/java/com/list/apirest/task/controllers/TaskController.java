package com.list.apirest.task.controllers;

import com.list.apirest.task.services.TaskServices;

import com.list.apirest.task.tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
