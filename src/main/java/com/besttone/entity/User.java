package com.besttone.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_users")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String state;

    // ... additional members, often include @OneToMany mappings

    public User() {
        // no-args constructor required by JPA spec
        // this one is protected since it shouldn't be used directly
    }


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
// ... etc
}
