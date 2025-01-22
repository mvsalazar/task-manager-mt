package com.taskmanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    private String nickName;

    private Integer family;

    private UserType type;

    public Integer getId() { return this.id; }

    public void setId(Integer id) { this.id = id; }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() { return this.nickName; };

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getFamily() { return this.family; };

    public void setFamily(Integer family) {
        this.family = family;
    }

    public UserType getType() { return this.type; };

    public void setType(UserType userType) {
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
