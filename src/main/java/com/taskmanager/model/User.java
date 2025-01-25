package com.taskmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinTable;

import jakarta.persistence.GenerationType;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    private String nickName;

    @ManyToOne
    @JoinColumn(name = "family_id")
    private Family family;

    private UserType type;

    @ManyToMany
    @JoinTable(
            name = "user_routine",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "routine_id")
    )
    final private Set<Routine> routines = new HashSet<>();

    public User(){};

    public User(final String name, final String nickName, final UserType userType) {
        this.name = name;
        this.nickName = nickName;
        this.type = userType;
    }

    public Integer getId() { return this.id; }

    public void setId(final Integer id) { this.id = id; }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getNickName() { return this.nickName; };

    public void setNickName(final String nickName) {
        this.nickName = nickName;
    }

    public Family getFamily() { return this.family; };

    public void setFamily(final Family family) {
        this.family = family;
    }

    public UserType getType() { return this.type; };

    public void setType(final UserType userType) {
        this.type = userType;
    }
}

// Users
    // Family
        // Members of family
            // Type (parent, child)
// Dashboard
    // Routines - morning, afternoon, night and add ability to add custom routines
        // Tasks
// Log daily tasks
// (+) add button to add a task
// Reward dashboard or accomplishments board
