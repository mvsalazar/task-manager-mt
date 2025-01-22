package com.taskmanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    private Routine routine;

    private TaskStatus status;

    private String icon;

    public Integer getId() { return this.id; }

    public void setId(Integer id) { this.id = id; }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Routine getRoutine() { return this.routine; }

    public void setRoutine(Routine routine) { this.routine = routine; }

    public TaskStatus getCompleted() { return this.status; }

    public void setCompleted(TaskStatus status) { this.status = status; }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
