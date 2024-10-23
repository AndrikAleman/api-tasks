package com.list.apirest.task.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table
public class tasks {

    @Id
    private int id;

    private String title;

    private String description;

    private LocalDateTime datec;

    private LocalDateTime datef;

    private String status;

    private int priority;

    private String type;

    //Important
    public tasks() {
    }

    public tasks(int id, String title, String description, LocalDateTime datec, LocalDateTime datef, String status, int priority, String type) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.datec = datec;
        this.datef = datef;
        this.status = status;
        this.priority = priority;
        this.type = type;
    }

    public tasks(String title, String description, LocalDateTime datec, LocalDateTime datef, String status, int priority, String type) {
        this.title = title;
        this.description = description;
        this.datec = datec;
        this.datef = datef;
        this.status = status;
        this.priority = priority;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDatec() {
        return datec;
    }

    public void setDatec(LocalDateTime datec) {
        this.datec = datec;
    }

    public LocalDateTime getDatef() {
        return datef;
    }

    public void setDatef(LocalDateTime datef) {
        this.datef = datef;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
