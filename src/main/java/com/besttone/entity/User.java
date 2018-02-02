package com.besttone.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_users")
public class User {

    private Long id;

    private String name;

    private String state;


    public String getName() {
        return this.name;
    }

    public String getState() {
        return this.state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(String state) {
        this.state = state;
    }
}
