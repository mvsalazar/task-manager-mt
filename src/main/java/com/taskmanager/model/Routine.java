package com.taskmanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Routine {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    private User user;

    private Dashboard dashboard;

    public Integer getId() { return this.id; }

    public void setId(Integer id) { this.id = id; }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public User getUser() { return this.user; }

    public void setUser(User user) { this.user = user; }

    public Dashboard getDashboard() { return this.dashboard; };

    public void setDashboard(Dashboard dashboard) { this.dashboard = dashboard; };
}
