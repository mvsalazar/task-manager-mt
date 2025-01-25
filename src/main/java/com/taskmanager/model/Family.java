package com.taskmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Id;
import java.util.List;

@Entity
public class Family {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "family", cascade = CascadeType.ALL)
    private List<User> users;

    @OneToMany(mappedBy = "family", cascade = CascadeType.ALL)
    private List<Dashboard> dashboards;

    public Integer getId() { return this.id; }

    public void setId(final Integer id) { this.id = id; }

    public String getName() { return this.name; };

    public void setName(final String name) { this.name = name; };
}
