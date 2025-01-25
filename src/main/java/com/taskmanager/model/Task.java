package com.taskmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "routine_id")
    private Routine routine;

    private TaskStatus status;

    private String icon;

    public Integer getId() { return this.id; }

    public void setId(final Integer id) { this.id = id; }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Routine getRoutine() { return this.routine; }

    public void setRoutine(final Routine routine) { this.routine = routine; }

    public TaskStatus getCompleted() { return this.status; }

    public void setCompleted(final TaskStatus status) { this.status = status; }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(final String icon) {
        this.icon = icon;
    }
}
