package com.taskmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Routine {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "routine_id")
    private Dashboard dashboard;

    @OneToMany(mappedBy = "routine", cascade = CascadeType.ALL)
    private List<Task> tasks;

    @ManyToMany(mappedBy = "routines")
    final private Set<User> users = new HashSet<>();

    public Integer getId() { return this.id; }

    public void setId(final Integer id) { this.id = id; }

    public String getName() { return this.name; }

    public void setName(final String name) { this.name = name; }

    public List<Task> getTasks() { return this.tasks; };

    public Set<User> getUsers() { return this.users; }

    public Dashboard getDashboard() { return this.dashboard; };

    public void setDashboard(final Dashboard dashboard) { this.dashboard = dashboard; };
}
