package com.taskmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Dashboard {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "family_id")
    private Family family;

    public Integer getId() { return this.id; }

    public void setId(final Integer id) { this.id = id; }

    public String getName() { return this.name; };

    public void setName(final String name) { this.name = name; };

    public Family getFamily() { return this.family; };

    public void setFamily(final Family family) { this.family = family; };
}
